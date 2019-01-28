package com.MavenTest.MavenTestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AppTest extends App {
	@Test
	public void test(){
		ReadingTestData testDataRecord = new ReadingTestData();
		getDriver().findElement(By.id("search-query")).sendKeys(testDataRecord.getTestData());
		getDriver().findElement(By.xpath("//button[@value='Search']")).click();
	}
}
