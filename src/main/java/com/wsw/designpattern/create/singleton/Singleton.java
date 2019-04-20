package com.wsw.designpattern.create.singleton;

/**   
 * @ClassName:  Singleton01   
 * @Description:
 * 					
 * 				单例设计模式
 * 
 * @author: wsw
 * @date:   2019年4月2日
 * @Copyright: http://www.iwangsiwei.com
 */
public class Singleton {

	
}


/**   
 * 	饿汉式单例
 * 	在类的初始化时，就创建对象实例，不会出现线程安全问题。
 * 	
 * 	用空间换时间的思路
 * 
 */
class 奔驰e{
	private static 奔驰e benzE = new 奔驰e();
	//private关键字私有其构造方法，外部无法创建该类的实例对象
	private 奔驰e() {
		super();
	}
	//对外部提供获取奔驰e实例对象的方法
	public static 奔驰e getInstance() {
		return benzE;
	}
}

/**   
 * 	懒汉式单例
 * 	在获取该类实例时，才会创建实例对象，单线程中安全，多线程中可能会创建多个对象
 * 
 * 	用时间换空间的设计思路
 */
class 奔驰c{
	private static 奔驰c benzC = null;
	private 奔驰c() {
		super();
	}
	public static 奔驰c getInstance() {
		if(benzC == null) {
			benzC = new 奔驰c();
		}
		return benzC;
	}
}

/**   
 * 	懒汉式单例在多线程情况下创建多个对象的解决方法1
 * 
 * 	双重检查与加锁实现
 */
class 奔驰s {
	private static 奔驰s benzS;
    private 奔驰s() {
		super();
	}
	// 双重检查,多线程情况下确保
    public static 奔驰s getInstance() {
        if (benzS == null) {
            synchronized (奔驰s.class) {
                if (benzS == null) {
                	benzS = new 奔驰s();
                }
            }
        }
        return benzS;
    }
}

/**   
 * 	懒汉式单例在多线程情况下创建多个对象的解决方法2
 * 
 * 	静态内部类法
 */
class 奔驰a {
	//通过静态内部类来获取奔驰a对象实例
	private static class benzAHolder{
		public static 奔驰a benzA = new 奔驰a();
	}
    private 奔驰a() {
		super();
	}
    public static 奔驰a getInstance() {
    	return benzAHolder.benzA;
    }
}

/**   
 * 	懒汉式单例在多线程情况下创建多个对象的解决方法3
 * 
 * 	使用同步机制，多线程情况下效率低不推荐
 */
class 奔驰gle {
	private static 奔驰gle benzGLE;
	private 奔驰gle() {
		super();
	}
	public static synchronized 奔驰gle getInstance() {
		if(benzGLE == null) {
			benzGLE = new 奔驰gle();
		}
		return benzGLE;
	}
}