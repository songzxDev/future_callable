/**   
* @Title: MyFirstUserinfo.java 
* @Package cn.songzx.futcal.first.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 上午11:34:51 
* @version V1.0   
*/
package cn.songzx.futcal.first.entity;

/**
 * @ClassName: MyFirstUserinfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 上午11:34:51
 * 
 */
public class MyFirstUserinfo {
	private String username;
	private String password;

	/**
	 * @Date: 2017年12月3日上午11:35:19
	 * @Title: MyFirstUserinfo.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public MyFirstUserinfo() {
		super();
	}

	/**
	 * @Date: 2017年12月3日上午11:35:25
	 * @Title: MyFirstUserinfo.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 * @param password
	 */
	public MyFirstUserinfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
