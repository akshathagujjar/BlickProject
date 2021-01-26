package com.blick.generics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{

	public void selectByValue(WebElement e, String val)
	{
		Select sel = new Select(e);
		sel.deselectByValue(val);
	}
	
	public void selectByVisibleText(WebElement e, String text)
	{
		Select sel = new Select(e);
		sel.selectByVisibleText(text);
	}
	
	public void clickUsingJavaScript(WebDriver driver, WebElement e)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	
	public void clickActions(WebDriver driver, WebElement e)
	{
		Actions a = new Actions(driver);
		a.click(e).perform();
	}
	
	public void hoverActions(WebDriver driver, WebElement e)
	{
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	public void performWaitUsingVisiblityof(WebDriver driver, WebElement e )
	{
		Duration time = Duration.ofSeconds(30);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void performWaitUsingElementToBeClickable(WebDriver driver ,WebElement e)
	{
		Duration timeout = Duration.ofSeconds(60);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	 public void performWaitUsingVisibilityofAllElemets(WebDriver driver ,List<WebElement> e)
	 {
		 Duration timeout = Duration.ofSeconds(60);
		 WebDriverWait wait = new WebDriverWait(driver, timeout);
		 wait.until(ExpectedConditions.visibilityOfAllElements(e));
	 }
	 
	 public void acceptAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }
	 
	 public void dismissAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().dismiss();
	 }
}
