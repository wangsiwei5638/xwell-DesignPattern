package com.wsw.designpattern.structure.adapter;

/**   
 * @ClassName:  AMGEngineAdapter   
 * @Description:
 * 
 * 					AMG引擎的适配器
 * 
 * @author: wsw
 * @date:   2019年4月23日
 * @Copyright: http://www.iwangsiwei.com
 */
public class AMGEngineAdapter implements EngineAdapter{

	private AMGEngine engine;
	
	public AMGEngineAdapter(AMGEngine engine) {
		this.engine = engine;
	}

	public void showInfo() {
		engine.showAMGInfo();
	}

}
