/**   
* @Title: MySecondRunC.java 
* @Package cn.songzx.futcal.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:22:09 
* @version V1.0   
*/
package cn.songzx.futcal.second.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import cn.songzx.futcal.second.executionhandler.MySecondRejectedExecutionHandlerA;
import cn.songzx.futcal.second.myrunnable.MySecondRunnableA;

/**
 * @ClassName: MySecondRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:22:09
 * 
 */
public class MySecondRunC {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
		// 接口RejectedExecutionHandler主要作用是当线程池关闭后依然有任务要执行时，可以实现一些处理。
		executor.setRejectedExecutionHandler(new MySecondRejectedExecutionHandlerA());
		service.submit(new MySecondRunnableA("A"));
		service.submit(new MySecondRunnableA("B"));
		service.submit(new MySecondRunnableA("C"));
		service.shutdown();
		service.submit(new MySecondRunnableA("D"));
	}
}
