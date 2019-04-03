package com.wsw.designpattern.factorypattern;

/**   
 * @ClassName:  FactoryPattern   
 * @Description:
 * 
 * 					工厂模式:
 * 
 * 					定义了一个创建奔驰的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到了子类。
 * 					
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public class FactoryPattern {

	public static void main(String[] args) {
		BenzFactory benzFactory1 = new BenzCFactory();
		Benz c = benzFactory1.createBenz();
		System.out.println(c.getName());
		c.run();
		System.out.println("====================");
		BenzFactory benzFactory2 = new BenzEFactory();
		Benz e = benzFactory2.createBenz();
		System.out.println(e.getName());
		e.run();
		System.out.println("====================");
		BenzFactory benzFactory3 = new BenzSFactory();
		Benz s = benzFactory3.createBenz();
		System.out.println(s.getName());
		s.run();
	}
	
}






