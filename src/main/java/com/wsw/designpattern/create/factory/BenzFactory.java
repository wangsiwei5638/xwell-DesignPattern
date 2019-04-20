package com.wsw.designpattern.create.factory;

/**   
 * @ClassName:  BenzFactory   
 * @Description:
 * 
 * 					奔驰工厂接口
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
interface BenzFactory{
	/**
	 * 创建奔驰，具体由子类实现
	 */
	Benz createBenz();
	
}

class BenzCFactory implements BenzFactory{
	public Benz createBenz() {
		return new BenzC();
	}
}
class BenzEFactory implements BenzFactory{
	public Benz createBenz() {
		return new BenzE();
	}
}
class BenzSFactory implements BenzFactory{
	public Benz createBenz() {
		return new BenzS();
	}
}