package com.blick.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blick.generics.BasePage;

public class BlickMyAccountDropdown extends BasePage 
{
	WebDriver driver;

	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement createAccountLink;
	
	@FindBy(xpath="//a[text()='View Orders']")
	private WebElement viewOrdersLink;
	
	@FindBy(xpath="//a[text()='Wish Lists']")
	private WebElement wishlistLink;
	
	public BlickMyAccountDropdown(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn()
	{
		performWaitUsingElementToBeClickable(driver, signInButton);
		signInButton.click();
	}
	
	
}
