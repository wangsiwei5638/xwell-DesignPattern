package com.wsw.designpattern.create.builder;

/**   
 * @ClassName:  BenzBuilder   
 * @Description:
 * 
 * 					建造者模型四要素之二：抽象建造者
 * ·				包含创建产品各个子部件的抽象方法
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public abstract class BenzBuilder {
	//奔驰产品 ，所有组件为空
	protected BenzProduct benzProduct = new BenzProduct();
	public abstract void buildEngine();
	public abstract void buildWheel();
	public abstract void buildPanel();
	public abstract void buildLight();
	/**
	 * 获取奔驰产品
	 */
	public BenzProduct getBenzProduct() {
		return this.benzProduct;
	}
	

}
