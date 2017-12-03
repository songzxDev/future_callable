/**   
* @Title: MyThirdRunB.java 
* @Package cn.songzx.futcal.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:33:26 
* @version V1.0   
*/
package cn.songzx.futcal.third.test;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyThirdRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:33:26
 * 
 */
public class MyThirdRunB_C {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.setThreadFactory(new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println("executor()方法通过使用自定义！");
						System.out.println("ThreadFactory也能捕获异常了！");
						e.printStackTrace();
					}

				});
				return t;
			}

		});
		executor.execute(new Runnable() {
			public void run() {
				Integer.parseInt("A");// 出现异常后直接打印堆栈信息
			}
		});
	}

}
