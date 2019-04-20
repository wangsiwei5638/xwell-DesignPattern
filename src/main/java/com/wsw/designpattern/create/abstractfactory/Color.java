package com.wsw.designpattern.create.abstractfactory;

/**   
 * @ClassName:  Color   
 * @Description:
 * 
 * 					车漆颜色接口
 * 
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public interface Color {
	String getColor();
}

class Red implements Color {
	public String getColor() {
		return "红色";
	}
}
class Dark implements Color {
	public String getColor() {
		return "黑色";
	}
}
class Blue implements Color {
	public String getColor() {
		return "蓝色";
	}
}