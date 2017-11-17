package com.Rbs.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Rbs.Pages.AnEveryDayBankAccountPage;
import com.Rbs.Pages.BookABranchAppointmentPage;
import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.OurRewardAccountPage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.TestBase.TestBase;

public class OurRewardAccountPageTest extends TestBase {

	OurRewardAccountPage orap;
	BookABranchAppointmentPage babap;
	public OurRewardAccountPageTest(){
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage hp=new HomePage();
		PersonalProductPage ppp=new PersonalProductPage();
		AnEveryDayBankAccountPage aedbap=new AnEveryDayBankAccountPage();
		ppp=hp.clickOnProductsLink();
		aedbap=ppp.clickOnAnEverydayBankAccount();
		orap=aedbap.clickOnOurRewardAccount();
	}
	@Test
	public void clickOnOurRewardAccountLinkTest() {
		babap=orap.clickOnBookABranchAppointment();
	}
}
