package com.wsw.designpattern.structure.adapter;

/**   
 * @ClassName:  OriginalEngineAdapter   
 * @Description:
 * 
 * 					原装发动机适配器
 * 
 * @author: wsw
 * @date:   2019年4月23日
 * @Copyright: http://www.iwangsiwei.com
 */
public class OriginalEngineAdapter implements EngineAdapter{

	private OriginalEngine engine;
	
	public OriginalEngineAdapter(OriginalEngine engine) {
		this.engine = engine;
	}

	public void showInfo() {
		engine.showOriginalInfo();
		
	}

}
