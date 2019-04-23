package com.wsw.designpattern.structure.adapter;

/**   
 * @ClassName:  App   
 * @Description:
 * 
 * 					适配器模式：使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 
 * 					现在有奔驰不同改装厂家的发动机，每个厂家显示信息的方法不同，需要一个适配器 EngineAdapter来统一规范。
 * 					或者可以理解为中国生产的充电器需要220V电压，日本的是110V电压，XX国是440V电压，
 * 					如果把日本充电器拿到中国使用或者XX国充电器到中国使用，则需要该国的充电器适配器
 * 					
 * @author: wsw
 * @date:   2019年4月23日
 * @Copyright: http://www.iwangsiwei.com
 */
public class App {

	public static void main(String[] args) {
		EngineAdapter amgEngineAdapter = new AMGEngineAdapter(new AMGEngine());
		EngineAdapter brabusEngineAdapter = new BRABUSEngineAdapter(new BRABUSEngine());
		EngineAdapter originalEngineAdapter = new OriginalEngineAdapter(new OriginalEngine());
		amgEngineAdapter.showInfo();
		brabusEngineAdapter.showInfo();
		originalEngineAdapter.showInfo();
	}
	
}
