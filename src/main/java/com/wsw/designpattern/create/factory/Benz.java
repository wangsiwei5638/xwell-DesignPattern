package com.wsw.designpattern.create.factory;
/**   
 * @ClassName:  Benz   
 * @Description:
 * 
 * 					定义奔驰接口
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public interface Benz{
	/**
	 * 获取车的名称
	 */
	String getName();
	/**
	 * 跑的方法
	 */
	void run();
}

/**   
 * 					奔驰C级，实现奔驰接口
 */
class BenzC implements Benz{
	public String getName() {
		return "奔驰C级";
	}
	public void run() {
		System.out.println("平均时速80");
	}
}

/**   
 * 					奔驰E级，实现奔驰接口
 */
class BenzE implements Benz{
	public String getName() {
		return "奔驰E级";
	}
	public void run() {
		System.out.println("平均时速100");
	}
}

/**   
 * 					奔驰S级，实现奔驰接口
 */
class BenzS implements Benz{
	public String getName() {
		return "奔驰S级";
	}
	public void run() {
		System.out.println("平均时速120");
	}
}