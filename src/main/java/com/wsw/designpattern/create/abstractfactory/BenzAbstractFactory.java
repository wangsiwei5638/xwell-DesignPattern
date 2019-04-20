package com.wsw.designpattern.create.abstractfactory;

/**   
 * @ClassName:  BenzAbstractFactory   
 * @Description:
 * 
 * 					奔驰车抽象工厂
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public interface BenzAbstractFactory {
	Type getType(String type);
	Color getColor(String color);
}

/**   
 * 国产奔驰工厂,目前只能制造奔驰e级车型以及红色或者黑色车车漆
 */
class ChinaBenzFactory implements BenzAbstractFactory{
	public Type getType(String type) {
		if("BENZE".equalsIgnoreCase(type)) {
			return new BenzE();
		}
		return null;
	}
	public Color getColor(String color) {
		if("RED".equalsIgnoreCase(color)) {
			return new Red();
		}else if("DARK".equalsIgnoreCase(color)) {
			return new Dark();
		}
		return null;
	}
}

/**   
 * 德国奔驰工厂,可以造车奔驰S和C63车型以及黑色和蓝色车漆
 */
class GermanyBenzFactory implements BenzAbstractFactory{
	public Type getType(String type) {
		if("BENZS".equalsIgnoreCase(type)) {
			return new BenzE();
		}else if("BENZC63".equalsIgnoreCase(type)){
			return new BenzC63();
		}
		return null;
	}
	public Color getColor(String color) {
		if("DARK".equalsIgnoreCase(color)) {
			return new Red();
		}else if("BLUE".equalsIgnoreCase(color)) {
			return new Dark();
		}
		return null;
	}
}
