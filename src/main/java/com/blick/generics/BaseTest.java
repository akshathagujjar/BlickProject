package com.blick.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstants
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionStarts()
	{
		Reporter.log("execution begins", true);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@AfterSuite
	public void executionEnds()
	{
		Reporter.log("execution ends", true);
	}
}
