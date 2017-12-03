/**   
* @Title: MyThirdRunB.java 
* @Package cn.songzx.futcal.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:33:26 
* @version V1.0   
*/
package cn.songzx.futcal.third.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyThirdRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:33:26
 * 
 */
public class MyThirdRunB_A {

	public static void main(String[] args) {
		ExecutorService executor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(new Runnable() {
			public void run() {
				Integer.parseInt("A");// 出现异常后直接打印堆栈信息
			}
		});
	}

}
