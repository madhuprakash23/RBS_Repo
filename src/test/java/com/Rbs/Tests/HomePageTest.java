package com.Rbs.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.TestBase.TestBase;

public class HomePageTest extends TestBase{
	
    
   PersonalProductPage ppp;
	
	HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage hp=new HomePage();
		ppp=hp.clickOnProductsLink();
		
	}
	@Test
	public void productLinkTest() {
	//ppp=hp.clickOnProductsLink();
	System.out.println("Clicked on Products");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
