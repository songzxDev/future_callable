/**   
* @Title: MySecondCallableA.java 
* @Package cn.songzx.futcal.second.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:04:41 
* @version V1.0   
*/
package cn.songzx.futcal.second.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MySecondCallableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:04:41
 * 
 */
public class MySecondCallableA implements Callable<String> {

	/**
	 * @Date: 2017年12月3日下午1:04:41
	 * @Title: call
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws Exception
	 * @return 返回值类型
	 */
	@Override
	public String call() throws Exception {
		Thread.sleep(10000L);
		System.out.println("sleep 10秒执行完了！");
		return "anyString";
	}

}
