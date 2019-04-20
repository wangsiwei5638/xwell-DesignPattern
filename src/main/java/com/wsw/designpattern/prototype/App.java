package com.wsw.designpattern.prototype;

/**   
 * @ClassName:  App   
 * @Description:
 * 
 *					原型模式:是用于创建重复的对象，同时又能保证性能。
 *					这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。 
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 * 
 * @see com.wsw.designpattern.prototype.CopyTest
 */
public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		BenzGLC benzGLC = new BenzGLC("奔驰GLC原型车", "最高车速240，百公里加速7.8秒，售价36万");
		//调用克隆方法，克隆原型，再修改部分属性
		BenzGLC beijingBenzGLC = (BenzGLC) benzGLC.clone();
		beijingBenzGLC.setName("北京奔驰GLC");
		BenzGLC germanyBenzGLC = (BenzGLC) benzGLC.clone();
		germanyBenzGLC.setName("德国奔驰GLC");
		BenzGLC germanyAMGBenzGLC = (BenzGLC) benzGLC.clone();
		germanyAMGBenzGLC.setInfo("最高车速310，百公里加速4.9秒，售价80万");
		germanyAMGBenzGLC.setName("德国奔驰AMG-GLC");
		BenzGLC americaBenzGLC = (BenzGLC) benzGLC.clone();
		americaBenzGLC.setName("美国奔驰GLC");
		
		beijingBenzGLC.display();
		germanyBenzGLC.display();
		germanyAMGBenzGLC.display();
		americaBenzGLC.display();
		
	}
	
	@Override
	public String toString() {
		return "app";
	}
}
