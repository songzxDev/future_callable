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
public class MyFirstCallableA implements Callable<String> {

	private int age;

	/**
	 * @Date: 2017年12月3日上午11:21:37
	 * @Title: MyFirstCallableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param age
	 */
	public MyFirstCallableA(int age) {
		super();
		this.age = age;
	}

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
		Thread.sleep(8000L);
		return "返回值，年龄是：" + age;
	}

}
