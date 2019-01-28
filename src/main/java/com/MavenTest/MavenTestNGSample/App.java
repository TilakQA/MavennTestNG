package com.MavenTest.MavenTestNGSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class App 
{
	private WebDriver driver;
	
	@BeforeClass
	public void chromeTest() {
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://etsy.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
