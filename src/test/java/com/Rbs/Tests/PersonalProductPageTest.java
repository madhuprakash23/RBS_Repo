package com.Rbs.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Rbs.Pages.AnEveryDayBankAccountPage;
import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.TestBase.TestBase;

public class PersonalProductPageTest extends TestBase {


	PersonalProductPage ppp;
	AnEveryDayBankAccountPage aedbap;
	public PersonalProductPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage hp=new HomePage();
		ppp=hp.clickOnProductsLink();
	}
	@Test
	public void anEverydayBankAccountLinkTest() {

  aedbap= ppp.clickOnAnEverydayBankAccount();
	}
	
}
