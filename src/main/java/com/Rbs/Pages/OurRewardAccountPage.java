package com.Rbs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rbs.TestBase.TestBase;

public class OurRewardAccountPage extends TestBase{

	@FindBy(css="#readytoapply > div > div > div.col-xs-12.col-sm-5.col-md-5.col-lg-5.col-sm-offset-1.col-md-offset-1.col-lg-offset-1 > div.cta-wrapper > a > span")
	WebElement bookABranchAppointment;
	
	public OurRewardAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	public BookABranchAppointmentPage clickOnBookABranchAppointment() {
		bookABranchAppointment.click();
		return new BookABranchAppointmentPage();
	}
	
	
}
