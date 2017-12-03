/**   
* @Title: MySecondRejectedExecutionHandlerA.java 
* @Package cn.songzx.futcal.second.executionhandler 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:19:20 
* @version V1.0   
*/
package cn.songzx.futcal.second.executionhandler;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName: MySecondRejectedExecutionHandlerA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:19:20
 * 
 */
public class MySecondRejectedExecutionHandlerA implements RejectedExecutionHandler {

	/**
	 * @Date: 2017年12月3日下午1:19:20
	 * @Title: rejectedExecution
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param r
	 * @param executor
	 * @return 返回值类型
	 */
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((FutureTask) r).toString() + "被拒绝！");
	}

}
