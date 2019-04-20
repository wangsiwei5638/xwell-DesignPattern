package com.wsw.designpattern.builder;

/**   
 * @ClassName:  BenzBuilderImplS   
 * @Description:
 * 
 * 					建造者模型四要素之三：具体建造者
 * 					奔驰S级的建造者，实现了抽象建造者接口
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class BenzBuilderImplS extends BenzBuilder{

	@Override
	public void buildEngine() {
		super.benzProduct.setEngine("奔驰S级发动机");
	}

	@Override
	public void buildWheel() {
		super.benzProduct.setWheel("售价25000人民币一个的豪华车轮毂");
	}

	@Override
	public void buildPanel() {
		super.benzProduct.setPanel("奔驰S级豪华仪表盘");
	}

	@Override
	public void buildLight() {
		super.benzProduct.setLight("奔驰S级豪华车灯");
		
	}
	
	
	
	

}
