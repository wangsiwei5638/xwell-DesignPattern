package com.wsw.designpattern.create.abstractfactory;

/**   
 * @ClassName:  Type   
 * @Description:
 * 
 *  				车型的接口
 *  
 * @author: wsw
 * @date:   2019年4月3日
 * @Copyright: http://www.iwangsiwei.com
 */
public interface Type {

	String getType();
}

class BenzE implements Type{
	public String getType() {
		return "奔驰E系列";
	}
}
class BenzS implements Type{
	public String getType() {
		return "奔驰S系列";
	}
}
class BenzC63 implements Type{
	public String getType() {
		return "奔驰C63跑车系列";
	}
}