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
class BenzE{
	private static BenzE benzE = new BenzE();
	//private关键字私有其构造方法，外部无法创建该类的实例对象
	private BenzE() {
		super();
	}
	//对外部提供获取BenzE实例对象的方法
	public static BenzE getInstance() {
		return benzE;
	}
}

/**   
 * 	懒汉式单例
 * 	在获取该类实例时，才会创建实例对象，单线程中安全，多线程中可能会创建多个对象
 * 
 * 	用时间换空间的设计思路
 */
class BenzC{
	private static BenzC benzC = null;
	private BenzC() {
		super();
	}
	public static BenzC getInstance() {
		if(benzC == null) {
			benzC = new BenzC();
		}
		return benzC;
	}
}

/**   
 * 	懒汉式单例在多线程情况下创建多个对象的解决方法1
 * 
 * 	双重检查与加锁实现
 */
class BenzS {
	private static BenzS benzS;
    private BenzS() {
		super();
	}
	// 双重检查,多线程情况下确保
    public static BenzS getInstance() {
        if (benzS == null) {
            synchronized (BenzS.class) {
                if (benzS == null) {
                	benzS = new BenzS();
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
class BenzA {
	//通过静态内部类来获取BenzA对象实例
	private static class benzAHolder{
		public static BenzA benzA = new BenzA();
	}
    private BenzA() {
		super();
	}
    public static BenzA getInstance() {
    	return benzAHolder.benzA;
    }
}

/**   
 * 	懒汉式单例在多线程情况下创建多个对象的解决方法3
 * 
 * 	使用同步机制，多线程情况下效率低不推荐
 */
class BenzGLE {
	private static BenzGLE benzGLE;
	private BenzGLE() {
		super();
	}
	public static synchronized BenzGLE getInstance() {
		if(benzGLE == null) {
			benzGLE = new BenzGLE();
		}
		return benzGLE;
	}
}