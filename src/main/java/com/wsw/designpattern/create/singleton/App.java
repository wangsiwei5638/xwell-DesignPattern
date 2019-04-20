package com.wsw.designpattern.create.singleton;

/**   
 * @ClassName:  App   
 * @Description:
 * 
 * 					单例模式
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
public class App {
	
	public static void main(String[] args) {
		BenzA instance1 = BenzA.getInstance();
		BenzA instance2 = BenzA.getInstance();
		System.out.println(instance1 == instance2);
		
		BenzC instance3 = BenzC.getInstance();
		BenzC instance4 = BenzC.getInstance();
		System.out.println(instance3 == instance4);
		
		BenzE instance5 = BenzE.getInstance();
		BenzE instance6 = BenzE.getInstance();
		System.out.println(instance5 == instance6);
		
		BenzS instance7 = BenzS.getInstance();
		BenzS instance8 = BenzS.getInstance();
		System.out.println(instance7 == instance8);
		
		BenzGLE instance9 = BenzGLE.getInstance();
		BenzGLE instance10 = BenzGLE.getInstance();
		System.out.println(instance9 == instance10);
	}

}
