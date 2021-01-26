package com.blick.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


import com.blick.generics.BaseTest;
import com.blick.pom.BlickHomePage;

public class BlickSearchTest extends BaseTest
{
	@Test
	public void searchTest()
	{
		BlickHomePage home = new BlickHomePage(driver);
		home.performSearch();
	}
}
