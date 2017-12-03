/**   
* @Title: MyFirstRunD.java 
* @Package cn.songzx.futcal.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:58:14 
* @version V1.0   
*/
package cn.songzx.futcal.first.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.futcal.first.mycallable.MyFirstCallableC_A;

/**
 * @ClassName: MyFirstRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:58:14
 * 
 */
public class MyFirstRunD_A {

	/**
	 * @Date: 2017年12月3日上午11:58:14
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstCallableC_A callable = new MyFirstCallableC_A();
			ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<String> future = executor.submit(callable);
			Thread.sleep(4000L);
			// 线程并未中断运行，返回true代表发送中断线程的命令是成功的，但是否中断要取决于有没有
			// if(Thread.currentThread().isInterrupted())代码
			System.out.println(future.cancel(true) + " " + future.isCancelled());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
