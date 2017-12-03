/**   
* @Title: MyFirstRunnableA.java 
* @Package cn.songzx.futcal.first.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:36:40 
* @version V1.0   
*/
package cn.songzx.futcal.first.myrunnable;

import cn.songzx.futcal.first.entity.MyFirstUserinfo;

/**
 * @ClassName: MyFirstRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:36:40
 * 
 */
public class MyFirstRunnableA implements Runnable {

	private MyFirstUserinfo userinfo;

	/**
	 * @Date: 2017年12月3日上午11:37:22
	 * @Title: MyFirstRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param userinfo
	 */
	public MyFirstRunnableA(MyFirstUserinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	/**
	 * @Date: 2017年12月3日上午11:36:40
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		userinfo.setUsername("usernameValue");
		userinfo.setPassword("passwordValue");
	}

}
