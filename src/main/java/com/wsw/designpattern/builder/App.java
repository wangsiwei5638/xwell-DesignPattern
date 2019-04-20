package com.wsw.designpattern.builder;

/**   
 * @ClassName:  App   
 * @Description:
 * 
 * 					建造者模式
 * 					由产品、抽象建造者、具体建造者、指挥者组成
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class App {

	public static void main(String[] args) {
		Director directorE = new Director(new BenzBuilderImplE());
		Director directorS = new Director(new BenzBuilderImplS());
		BenzProduct benzE  = directorE.construct();
		BenzProduct benzS  = directorS.construct();
		System.out.println(benzE.showInfo());
		System.out.println(benzS.showInfo());
	}
}
