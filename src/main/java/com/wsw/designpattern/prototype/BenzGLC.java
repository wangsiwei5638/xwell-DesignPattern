package com.wsw.designpattern.prototype;

import java.io.Serializable;

/**   
 * @ClassName:  BenzGLC   
 * @Description:
 * 
 * 				奔驰GLC实体对象，实现Cloneable接口
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class BenzGLC implements Cloneable,Serializable{

	private static final long serialVersionUID = -25035495664319993L;
	private String name;
	private String info;
	
	public BenzGLC(String name, String info) {
		super();
		this.name = name;
		this.info = info;
	}
	
	public void display() {
		System.out.println("型号："+name+"=====配置："+info);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
