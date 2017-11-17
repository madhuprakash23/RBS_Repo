package com.Rbs.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Rbs.Pages.AnEveryDayBankAccountPage;
import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.Pages.VisitUsAtBranchPage;
import com.Rbs.TestBase.TestBase;

public class VisitUsAtBranchPageTest extends TestBase {

	public VisitUsAtBranchPage vuabpt;
	
	public VisitUsAtBranchPageTest() {
		super();
	}
	@BeforeMethod
	public  void setUp() {
		initialization();
		HomePage hp=new HomePage();
		PersonalProductPage ppp=new PersonalProductPage();
		ppp=hp.clickOnProductsLink();
		AnEveryDayBankAccountPage aebap=new AnEveryDayBankAccountPage();
		aebap=ppp.clickOnAnEverydayBankAccount();
		vuabpt=	aebap.clickOnVisitUsAtBranch();
	}
	
	@Test
	public void clickOnVisitUsAtBranchLinkTest() {
		
		vuabpt.handleNewWindow();
	}
}
