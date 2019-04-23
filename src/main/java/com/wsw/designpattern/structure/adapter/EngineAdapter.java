package com.wsw.designpattern.structure.adapter;

/**   
 * @ClassName:  EngineAdapter   
 * @Description:
 * 
 * 					发动机适配器
 * 					每种发动机，显示信息的方法不同，需要适配器，来实现统一的方法
 * 
 * @author: wsw
 * @date:   2019年4月23日
 * @Copyright: http://www.iwangsiwei.com
 */
public interface EngineAdapter {
	
	public void showInfo();
	
}
