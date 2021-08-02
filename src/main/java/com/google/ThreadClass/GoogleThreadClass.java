package com.google.ThreadClass;

import com.thread.Pages.GooglePage;

public class GoogleThreadClass extends Thread {

	public String BrowserName;
	public GooglePage Gpage;

	public GoogleThreadClass(String ThreadName, String BrowserName) {
		super(ThreadName);
		this.BrowserName = BrowserName;
		Gpage = new GooglePage();

	}

	@Override
	public void run() {

		System.out.println("Thread ---Started " + Thread.currentThread().getName());

		try {
			//Thread.sleep(2000);
			Gpage.setup(this.BrowserName);

			Gpage.GoogleSearchTest();
			Thread.sleep(2000);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();

		} 
////		finally {
//
//			Gpage.TearDown();
//		}

	}
}
