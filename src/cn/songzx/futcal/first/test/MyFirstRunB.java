/**   
* @Title: MyFirstRunB.java 
* @Package cn.songzx.futcal.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:38:33 
* @version V1.0   
*/
package cn.songzx.futcal.first.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.futcal.first.entity.MyFirstUserinfo;
import cn.songzx.futcal.first.myrunnable.MyFirstRunnableA;

/**
 * @ClassName: MyFirstRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:38:33
 * 
 */
public class MyFirstRunB {

	/**
	 * @Date: 2017年12月3日上午11:38:33
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstUserinfo userinfo = new MyFirstUserinfo();
			MyFirstRunnableA myrunnable = new MyFirstRunnableA(userinfo);
			ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<MyFirstUserinfo> future = pool.submit(myrunnable, userinfo);
			System.out.println("begin time=" + System.currentTimeMillis());
			userinfo = future.get();
			System.out.println("get value " + userinfo.getUsername() + " " + userinfo.getPassword());
			System.out.println("  end time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
