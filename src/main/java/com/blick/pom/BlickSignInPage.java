package com.blick.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blick.generics.BasePage;
import com.blick.generics.ExcelLibrary;

public class BlickSignInPage extends BasePage
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//span[@class='css-xp804j']")
	private WebElement showPasswordButton;
	
	@FindBy(xpath="//input[@id='rememberme']")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInButton;
	
	@FindBy(xpath="//span[text()='Forgot password']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[@href='/register']")
	private WebElement createAccountButton;
	
	public BlickSignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void performSignin() throws IOException
	{
		performWaitUsingElementToBeClickable(driver, emailField);
		emailField.sendKeys(ExcelLibrary.cellValue("login", 3, 0));
		
		performWaitUsingElementToBeClickable(driver, passwordField);
		passwordField.sendKeys(ExcelLibrary.cellValue("login", 3, 1));
		
		performWaitUsingElementToBeClickable(driver, showPasswordButton);
		showPasswordButton.click();
		
//		performWaitUsingElementToBeClickable(driver, rememberMeCheckBox);
//		rememberMeCheckBox.click();
		
		performWaitUsingElementToBeClickable(driver, signInButton);
		signInButton.click();
	}
	
	public void selectCreateAccount()
	{
		performWaitUsingElementToBeClickable(driver, createAccountButton);
		createAccountButton.click();
	}
}
