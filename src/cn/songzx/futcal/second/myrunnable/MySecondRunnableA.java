/**   
* @Title: MySecondRunnableA.java 
* @Package cn.songzx.futcal.second.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:21:12 
* @version V1.0   
*/
package cn.songzx.futcal.second.myrunnable;

/**
 * @ClassName: MySecondRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:21:12
 * 
 */
public class MySecondRunnableA implements Runnable {
	private String username;

	/**
	 * @Date: 2017年12月3日下午1:21:36
	 * @Title: MySecondRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 */
	public MySecondRunnableA(String username) {
		super();
		this.username = username;
	}

	/**
	 * @Date: 2017年12月3日下午1:21:12
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println(username + "在运行！");
	}

}
