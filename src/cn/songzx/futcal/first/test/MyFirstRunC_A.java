/**   
* @Title: MyFirstRunC.java 
* @Package cn.songzx.futcal.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:46:09 
* @version V1.0   
*/
package cn.songzx.futcal.first.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.futcal.first.mycallable.MyFirstCallableB;

/**
 * @ClassName: MyFirstRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:46:09
 * 
 */
public class MyFirstRunC_A {

	/**
	 * @Date: 2017年12月3日上午11:46:09
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstCallableB callable = new MyFirstCallableB();
			ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<String> future = executor.submit(callable);
			// System.out.println(future.get());
			// 任务在没有运行完成之前执行了cancel()方法返回为true，代表成功发送取消命令
			System.out.println(future.cancel(true) + " " + future.isCancelled());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
