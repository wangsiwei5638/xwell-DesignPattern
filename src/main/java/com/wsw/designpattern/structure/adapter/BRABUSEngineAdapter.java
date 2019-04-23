package com.wsw.designpattern.structure.adapter;

/**   
 * @ClassName:  BRABUSEngineAdapter   
 * @Description:
 * 
 * 					巴博斯发动机适配器
 * 
 * @author: wsw
 * @date:   2019年4月23日
 * @Copyright: http://www.iwangsiwei.com
 */
public class BRABUSEngineAdapter implements EngineAdapter{

	private BRABUSEngine brabusEngine;
	
	public BRABUSEngineAdapter(BRABUSEngine brabusEngine) {
		this.brabusEngine = brabusEngine;
	}

	public void showInfo() {
		brabusEngine.showBRABUSInfo();
	}

}
