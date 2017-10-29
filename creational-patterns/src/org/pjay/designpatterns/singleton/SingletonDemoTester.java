/**
 * 
 */
package org.pjay.designpatterns.singleton;

/**
 * @author Vijay
 *
 */
public class SingletonDemoTester implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Without using threads
/*		SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
		System.out.println("singletonDemo1 instance hascode without Threads: " + singletonDemo1.hashCode());
		SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
		System.out.println("singletonDemo2 instance hascode without Threads: " + singletonDemo2.hashCode());*/
		// Output:
		//singletonDemo1 instance hascode without Threads: 366712642
		//singletonDemo2 instance hascode without Threads: 366712642
		
		new Thread(new SingletonDemoTester()).start();
		new Thread(new SingletonDemoTester()).start();
		// Output: Can some times create different instances, though it is singleton.
		// Please see some update on some random runs
		// singletonDemo instance hascode using Threads: 1550137376
		// singletonDemo instance hascode using Threads: 236122497
		// This can be solved using synchronized for getInstance method this can impact performance
		// To avoid performance issue by using synchronized(SingletonDemo.class){if(null == singletonDemo){singletonDemo = new SingletonDemo();}} inside getInstance() method
		// Above code makes the method synchronized till the first instance of the SingletonDemo class is created, after this it is not synchronized

		SingletonEnumDemo.MYINSTANCE.doStuff();
		SingletonEnumDemo.MYINSTANCE.doStuff();
	}

	@Override
	public void run() {
		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		System.out.println("singletonDemo instance hascode using Threads: " + singletonDemo.hashCode());
		//System.out.println("=====================================================");
		SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
		System.out.println("singletonDemo1 instance using eager loading and hascode using Threads: " + singletonDemo1.hashCode());
	}

}
