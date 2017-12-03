/**   
* @Title: MyFirstRunA_A.java 
* @Package cn.songzx.futcal.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:28:43 
* @version V1.0   
*/
package cn.songzx.futcal.first.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName: MyFirstRunA_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:28:43
 * 
 */
public class MyFirstRunA_A {

	/**
	 * @Date: 2017年12月3日上午11:28:43
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			Runnable runnable = new Runnable() {
				public void run() {
					System.out.println("打印的信息！");
				}
			};
			ExecutorService executorRef = Executors.newCachedThreadPool();
			Future future = executorRef.submit(runnable);
			System.out.println(future.get() + " " + future.isDone());// isDone()方法无阻塞性
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
