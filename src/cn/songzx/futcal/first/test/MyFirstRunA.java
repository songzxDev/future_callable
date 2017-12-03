/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.futcal.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:23:41 
* @version V1.0   
*/
package cn.songzx.futcal.first.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.futcal.first.mycallable.MyFirstCallableA;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:23:41
 * 
 */
public class MyFirstRunA {

	/**
	 * @Date: 2017年12月3日上午11:23:41
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstCallableA callable = new MyFirstCallableA(100);
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<String> future = executor.submit(callable);
			System.out.println("Main A " + System.currentTimeMillis());
			System.out.println(future.get());// get()方法具有阻塞性
			System.out.println("Main B " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
