/**
 * 
 */
package org.pjay.designpatterns.singleton;

/**
 * @author Vijay
 *
 */
public class SingletonDemo {
	
	private static SingletonDemo singletonDemo;
	
	private SingletonDemo(){
		
	}
	
	public static SingletonDemo getInstance(){
		if(null == singletonDemo){
			synchronized(SingletonDemo.class){
				if(null == singletonDemo){
					singletonDemo = new SingletonDemo();
				}
			}
		}
		return singletonDemo;
	}
	
}
