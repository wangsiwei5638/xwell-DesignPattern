package com.wsw.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/**   
 * @ClassName:  CopyTest   
 * @Description:
 * 
 * 					原型模式深拷贝和浅拷贝讲解
 * 				
 * 					浅拷贝：只复制一个对象，对象内部存在的指向其他对象数组或者引用则不复制 =>simpleCopy()方法
 * 					深拷贝：对象，对象内部的引用均复制 =>deepCopy()方法
 * 						 深拷贝需要实现Serializable接口，否则会抛java.io.NotSerializableException异常
 * 
 * @author: wsw
 * @date:   2019年4月20日
 * @Copyright: http://www.iwangsiwei.com
 */
@SuppressWarnings("unchecked")
public class CopyTest {
	private static HashMap<String, Object> target = new HashMap<String, Object>();
	static {
		target.put("key1", "value1");
		target.put("key2", "value2");
		target.put("key3", new Integer(3));
		target.put("key4", new BenzGLC("奔驰GLC", "测试深拷贝和浅拷贝"));
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("==========浅拷贝开始==========");
		simpleCopy();
		System.out.println("==========浅拷贝结束==========");
		System.out.println("==========深拷贝开始==========");
		deepCopy();
		System.out.println("==========深拷贝结束==========");
	}
	//浅拷贝：只复制一个对象，对象内部存在的指向其他对象数组或者引用则不复制 
	public static Map<String, Object> simpleCopy(){
		HashMap<String, Object> copy = (HashMap<String, Object>) target.clone();
		System.out.println(target == copy);
		System.out.println(target.get("key1") == copy.get("key1"));
		System.out.println(target.get("key2") == copy.get("key2"));
		System.out.println(target.get("key3") == copy.get("key3"));
		System.out.println(target.get("key4") == copy.get("key4"));
		return copy;
		
	}
	//深拷贝：对象，对象内部的引用均复制
	public static Map<String, Object> deepCopy() throws Exception{
		//读target
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream ();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		objectOutputStream.writeObject(target);
		//写target
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		HashMap<String, Object> copy = (HashMap<String, Object>) objectInputStream.readObject();
		//关流
		objectOutputStream.close();
		objectInputStream.close();
		System.out.println(target == copy);
		System.out.println(target.get("key1") == copy.get("key1"));
		System.out.println(target.get("key2") == copy.get("key2"));
		System.out.println(target.get("key3") == copy.get("key3"));
		System.out.println(target.get("key4") == copy.get("key4"));
		return copy;
	}
	
	
}
