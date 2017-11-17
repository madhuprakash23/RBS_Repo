package com.Rbs.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Rbs.Pages.AnEveryDayBankAccountPage;
import com.Rbs.Pages.BookABranchAppointmentPage;
import com.Rbs.Pages.HomePage;
import com.Rbs.Pages.OurRewardAccountPage;
import com.Rbs.Pages.PersonalProductPage;
import com.Rbs.TestBase.TestBase;

public class BookABranchAppointmentPageTest extends TestBase {

	BookABranchAppointmentPage babap;
	public BookABranchAppointmentPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
//		HomePage hp=new HomePage();
//		PersonalProductPage ppp=new PersonalProductPage();
//		ppp=hp.clickOnProductsLink();
//		AnEveryDayBankAccountPage aedbap=new AnEveryDayBankAccountPage();
//		aedbap=ppp.clickOnAnEverydayBankAccount();
//		OurRewardAccountPage orap=new OurRewardAccountPage();
//		orap=aedbap.clickOnOurRewardAccount();
//		babap=orap.clickOnBookABranchAppointment();
		babap=new BookABranchAppointmentPage();
//		
	}
	@Test
	@Parameters("browser")
	public void enterPostCodeAndFindBranchTest() {
		babap.enterPostCodeAndFindBranch();
		System.out.println("Clicked On Random appointment Time");
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}
