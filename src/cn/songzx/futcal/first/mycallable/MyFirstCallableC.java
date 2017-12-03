/**   
* @Title: MyFirstCallableA.java 
* @Package cn.songzx.futcal.first.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:21:13 
* @version V1.0   
*/
package cn.songzx.futcal.first.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyFirstCallableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:21:13
 * 
 */
public class MyFirstCallableC implements Callable<String> {

	/**
	 * @Date: 2017年12月3日上午11:21:13
	 * @Title: call
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws Exception
	 * @return 返回值类型
	 */
	@Override
	public String call() throws Exception {
		int i = 0;
		while (i == 0) {
			if (Thread.currentThread().isInterrupted()) {
				throw new InterruptedException();
			}
			System.out.println(" 正在运行中！");
		}
		return "我的年龄是：100岁！";
	}

}
