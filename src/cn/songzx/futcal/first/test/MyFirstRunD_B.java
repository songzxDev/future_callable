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

import cn.songzx.futcal.first.mycallable.MyFirstCallableC_B;

/**
 * @ClassName: MyFirstRunD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:58:14
 * 
 */
public class MyFirstRunD_B {

	/**
	 * @Date: 2017年12月3日上午11:58:14
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstCallableC_B callable = new MyFirstCallableC_B();
			ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<String> future = executor.submit(callable);
			Thread.sleep(4000L);
			// 从打印结果上看，输出了一个true，则代表成功发送取消的命令，但是由于cancel()方法的参数为false，所以线程并没有中断成功
			System.out.println(future.cancel(false) + " " + future.isCancelled());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
