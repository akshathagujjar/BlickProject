package com.blick.pom;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blick.generics.BasePage;

public class BlickHomePage extends BasePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='popoutNav__popout-trigger']")
	private WebElement hamburgerIcon;
	
	@FindBy(xpath="//a[@title='Blick Home']")
	private WebElement blickLogo;
	
	@FindBy(xpath="//input[@aria-autocomplete='list']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//li[@class='css-el09ak']")
	private List<WebElement> searchSuggestionList;
	
	@FindBy(xpath="//button[@class='css-1q4o626 ezucgeh3']")
	private WebElement searchIcon;
	
	@FindBy(xpath="//a[@href='/myaccount']")
	private WebElement myAccountLink;
	
	@FindBy(xpath="//a[@href='/orders/'][text()='Orders']")
	private WebElement ordersLink;
	
	@FindBy(xpath="//a[@href='/cart']")
	private WebElement cartLink;
	
	
	public BlickHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void performSearch()
	{
		performWaitUsingVisiblityof(driver, searchBar);
		searchBar.sendKeys("liquitex");
		performWaitUsingVisibilityofAllElemets(driver, searchSuggestionList);
		System.out.println("the list size is "+searchSuggestionList.size());
		for(int i=0; i<searchSuggestionList.size(); i++)
		{
			if(searchSuggestionList.get(i).getText().equalsIgnoreCase("Liquitex Basics Acrylic Paints And Sets"))
			{
				searchSuggestionList.get(i).click();
			}
		}
		
	}
	
	public void AccountsDropDownHover()
	{
		performWaitUsingElementToBeClickable(driver, myAccountLink);
		hoverActions(driver, myAccountLink);
	}
	
}
