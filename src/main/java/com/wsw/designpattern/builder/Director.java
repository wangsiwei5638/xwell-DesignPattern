package com.wsw.designpattern.builder;

/**   
 * @ClassName:  Director   
 * @Description:
 * 
 * 				建造者模型四要素之四：指挥者
 * 				调用建造者中的方法完成复杂对象的创建。
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class Director {
	//抽象奔驰创建者
	private BenzBuilder benzBuilder;
	//提供构造方法，具实现体的奔驰产品创建者
	public Director(BenzBuilder benzBuilder) {
		this.benzBuilder = benzBuilder;
	}
	
	/**
	 * 组装的方法，实现对奔驰组件的创建
	 */
	public BenzProduct construct() {
		//创建产品
		benzBuilder.buildEngine();
		benzBuilder.buildLight();
		benzBuilder.buildPanel();
		benzBuilder.buildWheel();
		//返回产品
		return benzBuilder.getBenzProduct();
	}
	

}
