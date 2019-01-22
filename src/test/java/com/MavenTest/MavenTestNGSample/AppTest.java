package com.MavenTest.MavenTestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AppTest extends App {
	@Test
	public void test(){
		getDriver().findElement(By.id("search-query")).sendKeys("MatchBox");
		getDriver().findElement(By.xpath("//button[@value='Search']")).click();
	}
}
