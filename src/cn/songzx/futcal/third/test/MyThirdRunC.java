/**   
* @Title: MyThirdRunC.java 
* @Package cn.songzx.futcal.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:43:47 
* @version V1.0   
*/
package cn.songzx.futcal.third.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.futcal.third.mycallable.MyThirdCallableA;

/**
 * @ClassName: MyThirdRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:43:47
 * 
 */
public class MyThirdRunC {

	/**
	 * @Date: 2017年12月3日下午1:43:47
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * Callable接口与Runnable接口对比时主要优势，可以通过Future取得返回值，但需要注意的是，Future接口调用get()
		 * 方法取得处理的结果是阻塞性的，也就是说如果调用Future对象的get()方法，任务尚未完成，则一直阻塞到此任务完成时为止。
		 * 如果时这样的效果，则前面先执行的任务一旦耗时很多，则后面的任务调用get()方法就呈现阻塞状态，非常影响效率，主线程
		 * 并不能保证首先获得的是最先完成任务的返回值，这就是Future的缺点，影响效率。
		 */
		try {
			MyThirdCallableA callableA = new MyThirdCallableA("usernameA", 5000L);
			MyThirdCallableA callableB = new MyThirdCallableA("usernameB", 5000L);
			MyThirdCallableA callableC = new MyThirdCallableA("usernameC", 5000L);
			MyThirdCallableA callableD = new MyThirdCallableA("usernameD", 5000L);
			MyThirdCallableA callableE = new MyThirdCallableA("usernameE", 5000L);

			List<Callable> callabeList = new ArrayList<Callable>();
			callabeList.add(callableA);
			callabeList.add(callableB);
			callabeList.add(callableC);
			callabeList.add(callableD);
			callabeList.add(callableE);
			List<Future> futureList = new ArrayList<Future>();
			ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			for (int i = 0; i < 5; i++) {
				futureList.add(executor.submit(callabeList.get(i)));
			}
			System.out.println("Run first time= " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(futureList.get(i).get() + " " + System.currentTimeMillis());
			}
			// 按照顺序打印的效果，说明一个Future对应指定一个Callable
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
