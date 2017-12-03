/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.futcal.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午1:06:30 
* @version V1.0   
*/
package cn.songzx.futcal.second.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cn.songzx.futcal.second.mycallable.MySecondCallableB;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午1:06:30
 * 
 */
public class MySecondRunB {

	/**
	 * @Date: 2017年12月3日下午1:06:30
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MySecondCallableB callable = new MySecondCallableB("1");
			ExecutorService executorRef = Executors.newCachedThreadPool();
			Future<String> future = executorRef.submit(callable);
			// 如果出现异常，则进入catch语句，不再继续执行get()方法了，这于通过for循环调用get()方法时的效果是一样的，
			// 不再继续执行for循环，直接进入catch语句块。
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("里面出错了！");
			e.printStackTrace();
		}
	}

}
