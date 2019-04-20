package com.wsw.designpattern.create.builder;

/**   
 * @ClassName:  BenzBuilderImplE   
 * @Description:
 * 
 * 					建造者模型四要素之三：具体建造者
 * 					奔驰E级的建造者，实现了抽象建造者接口
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class BenzBuilderImplE extends BenzBuilder{

	@Override
	public void buildEngine() {
		super.benzProduct.setEngine("奔驰E级发动机");
	}

	@Override
	public void buildWheel() {
		super.benzProduct.setWheel("售价18000人民币一个的高档车轮毂");
	}

	@Override
	public void buildPanel() {
		super.benzProduct.setPanel("奔驰E级高档仪表盘");
	}

	@Override
	public void buildLight() {
		super.benzProduct.setLight("奔驰E级高档车灯");
		
	}
	
	
	
	

}
