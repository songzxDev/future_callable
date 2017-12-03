/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.futcal.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:06:30 
* @version V1.0   
*/
package cn.songzx.futcal.second.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import cn.songzx.futcal.second.mycallable.MySecondCallableA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:06:30
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017年12月3日下午1:06:30
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MySecondCallableA callable = new MySecondCallableA();
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			System.out.println("begin " + System.currentTimeMillis());
			Future<String> future = executor.submit(callable);
			System.out.println("返回值：" + future.get(5, TimeUnit.SECONDS));// 作用是在指定的最大时间内等待获取返回值
			System.out.println("  end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

}
