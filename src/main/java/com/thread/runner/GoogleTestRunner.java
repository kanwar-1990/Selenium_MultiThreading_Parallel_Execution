package com.thread.runner;

import com.google.ThreadClass.GoogleThreadClass;

public class GoogleTestRunner {

	public static void main(String[] args) throws InterruptedException {

		// Top Casting, reference of grand parent class
//		Thread t1 = new GoogleThreadClass("chrome thread", "chrome");
//		Thread t2 = new GoogleThreadClass("FireFox thread", "firefox");
//System.out.println("Thread Started======>");
//		t1.start();
//		Thread.sleep(1000);
//		t2.start();

		// Successfully running parallel execution with the help of thread
		
for (int i = 0; i <2; i++) {
	new GoogleThreadClass("chrome thread", "chrome").start();
	new GoogleThreadClass("FireFox thread", "firefox").start();

}
	
	
	
	}

	
}
