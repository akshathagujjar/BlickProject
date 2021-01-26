package com.blick.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blick.generics.AutoConstants;
import com.blick.generics.BasePage;
import com.blick.generics.ExcelLibrary;

public class BlickCreateAccountPage extends BasePage implements AutoConstants
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='first']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@id='last']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneField;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//span[text()='SHOW']")
	private WebElement showButton;
	
	@FindBy(xpath="//input[@id='verify']")
	private WebElement verifyPasswordField;
	
	@FindBy(xpath="//label[@class='css-kpi5vs efvg0pm9']")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//button[text()='Create Account']")
	private WebElement createAccountButton;
	
	public BlickCreateAccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount() throws IOException
	{
		performWaitUsingElementToBeClickable(driver, firstNameField);
		firstNameField.sendKeys(ExcelLibrary.cellValue("create account", 2, 0));
		
		performWaitUsingVisiblityof(driver, lastNameField);
		lastNameField.sendKeys(ExcelLibrary.cellValue("create account", 2, 1));
		
		performWaitUsingElementToBeClickable(driver, emailField);
		emailField.sendKeys(ExcelLibrary.cellValue("create account", 2, 2));
		
		performWaitUsingElementToBeClickable(driver, phoneField);
		phoneField.sendKeys(ExcelLibrary.cellValue("create account", 2, 3));
		
		performWaitUsingElementToBeClickable(driver, passwordField);
		passwordField.sendKeys(ExcelLibrary.cellValue("create account", 2, 4));
		
		performWaitUsingElementToBeClickable(driver, verifyPasswordField);
		verifyPasswordField.sendKeys(ExcelLibrary.cellValue("create account", 2, 5));
		
		performWaitUsingElementToBeClickable(driver, createAccountButton);
		createAccountButton.click();
		
	}
	
}
