package com.blick.test;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.blick.generics.BaseTest;
import com.blick.pom.BlickCreateAccountPage;
import com.blick.pom.BlickHomePage;
import com.blick.pom.BlickMyAccountDropdown;
import com.blick.pom.BlickSignInPage;

public class BlickSignInTest extends BaseTest
{
	
	
	@Test
	@Parameters({"email" ,"password"})
	public void signInTest(String email , String password) throws IOException, InterruptedException
	{
		BlickHomePage bh = new BlickHomePage(driver);
		bh.AccountsDropDownHover();
		
		BlickMyAccountDropdown d = new BlickMyAccountDropdown(driver);
		d.clickOnSignIn();
		
		BlickSignInPage signIn = new BlickSignInPage(driver);
		signIn.performSignin();
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
}
