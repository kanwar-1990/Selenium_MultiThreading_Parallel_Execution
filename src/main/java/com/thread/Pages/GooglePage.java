package com.thread.Pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {

	public void GoogleSearchTest() {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Naroto");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.tagName("h3")).stream().forEach(ele -> System.out.println(ele.getText()));
	}

//	public void TearDown() {
//		driver.quit();
//
//	}

}
