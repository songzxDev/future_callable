/**   
* @Title: MyThirdCallableA.java 
* @Package cn.songzx.futcal.third.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:44:41 
* @version V1.0   
*/
package cn.songzx.futcal.third.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyThirdCallableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:44:41
 * 
 */
public class MyThirdCallableA implements Callable<String> {

	private String username;
	private long sleepValue;

	/**
	 * @Date: 2017年12月3日下午1:45:52
	 * @Title: MyThirdCallableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 * @param sleepValue
	 */
	public MyThirdCallableA(String username, long sleepValue) {
		super();
		this.username = username;
		this.sleepValue = sleepValue;
	}

	@Override
	public String call() throws Exception {
		System.out.println(username);
		Thread.sleep(sleepValue);
		return "return " + username;
	}

}
