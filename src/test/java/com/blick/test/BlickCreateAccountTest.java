package com.blick.test;

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

public class BlickCreateAccountTest extends BaseTest
{

	@Test
	public void createAccountTest() throws IOException
	{
		BlickHomePage home = new BlickHomePage(driver);
		home.AccountsDropDownHover();
		
		BlickMyAccountDropdown dropdown = new BlickMyAccountDropdown(driver);
		dropdown.clickOnSignIn();
		
		BlickSignInPage signin = new BlickSignInPage(driver);
		signin.selectCreateAccount();
		
		BlickCreateAccountPage create = new BlickCreateAccountPage(driver);
		create.createAccount();
		
	}
}
