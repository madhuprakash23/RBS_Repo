package com.Rbs.Tests;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Rbs.Pages.AnEveryDayBankAccountPage;
import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.OurRewardAccountPage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.Pages.VisitUsAtBranchPage;
import com.Rbs.Pages.WaysToBankPage;
import com.Rbs.TestBase.TestBase;

public class AnEveryDayBankAccountPageTest extends TestBase {
	AnEveryDayBankAccountPage aebap;
	OurRewardAccountPage orap;
	WaysToBankPage wtbp;
	VisitUsAtBranchPage vuab;
	public AnEveryDayBankAccountPageTest(){
		super();
	}
     
	@BeforeMethod
	public void setUp() {
		
		initialization();
		HomePage hp=new HomePage();
		PersonalProductPage ppp;
		ppp=hp.clickOnProductsLink();
		aebap=ppp.clickOnAnEverydayBankAccount();
	}

//	@Test
//	public void clickOnOurRewardAccountLinkTest() {
//		orap=aebap.clickOnOurRewardAccount();
//	}
	@Test(priority=2)
	public void clickOnWaysToBankLinkTest() {
		wtbp=aebap.clickOnWaysToBank();
		//Assert.assertEquals(, expected);
	}
	@Test(priority=1)
	public void clickOnVisitUsAtBranchLinkTest() {
		vuab=aebap.clickOnVisitUsAtBranch();
		
		
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
