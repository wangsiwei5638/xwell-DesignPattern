package com.wsw.designpattern.create.abstractfactory;

/**   
 * @ClassName:  App   
 * @Description:
 * 
 * 					抽象工厂模式
 * 
 * 					提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public class App {

	public static void main(String[] args) {
		BenzAbstractFactory b1 = new ChinaBenzFactory();
		Color color1 = b1.getColor("red");
		Type type1 = b1.getType("benzE");
		System.out.println("==============国产奔驰==============");
		System.out.println(color1.getColor());
		System.out.println(type1.getType());
		BenzAbstractFactory b2 = new GermanyBenzFactory();
		Color color2 = b2.getColor("dark");
		Type type2 = b2.getType("benZC63");
		System.out.println("==============德国奔驰:=============");
		System.out.println(color2.getColor());
		System.out.println(type2.getType());
	}

}
