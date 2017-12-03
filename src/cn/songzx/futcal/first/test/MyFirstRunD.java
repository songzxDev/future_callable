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

import cn.songzx.futcal.first.mycallable.MyFirstCallableC;

/**
 * @ClassName: MyFirstRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:58:14
 * 
 */
public class MyFirstRunD {

	/**
	 * @Date: 2017年12月3日上午11:58:14
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstCallableC callable = new MyFirstCallableC();
			ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<String> future = executor.submit(callable);
			Thread.sleep(4000L);
			// 线程被成功中断，不再打印"正在运行中"字符，cancel()方法返回true代表发送中断线程的命令发送成功
			System.out.println(future.cancel(true) + " " + future.isCancelled());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
