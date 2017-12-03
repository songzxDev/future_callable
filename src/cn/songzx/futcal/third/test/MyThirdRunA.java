/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.futcal.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:28:24 
* @version V1.0   
*/
package cn.songzx.futcal.third.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:28:24
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017年12月3日下午1:28:24
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			executor.execute(new Runnable() {
				public void run() {
					System.out.println("execute()方法执行了，没有返回值！");
				}
			});
			Future future = executor.submit(new Callable<String>() {
				public String call() throws Exception {
					System.out.println("submit()方法执行了，有返回值！");
					return "我是返回值！";
				}
			});
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
