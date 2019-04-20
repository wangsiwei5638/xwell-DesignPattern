package com.wsw.designpattern.builder;

/**   
 * @ClassName:  Benz   
 * @Description:
 * 
 * 					建造者模型四要素之一 :产品
 * 					包含多个组成部件
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class BenzProduct {

	/**   
	 * @Fields engine : 发动机
	 */   
	private String engine;
	/**   
	 * @Fields wheel : 车轮
	 */   
	private String wheel;
	/**   
	 * @Fields wheel : 仪表盘
	 */   
	private String panel;
	/**   
	 * @Fields light : 车灯
	 */   
	private String light;
	
	public String showInfo() {
		return toString();
	}
	
	@Override
	public String toString() {
		return "BenzProduct [发动机=" + engine + ", 车轮=" + wheel + ", 仪表盘=" + panel + ", 车灯=" + light + "]";
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getPanel() {
		return panel;
	}
	public void setPanel(String panel) {
		this.panel = panel;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	
}
