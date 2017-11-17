package com.Rbs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rbs.TestBase.TestBase;

public class AnEveryDayBankAccountPage extends TestBase{
	
	@FindBy(css="#footer > div > div.row.contextual-menu-link > div:nth-child(2) > a")
	WebElement ourRewardAccount;
	@FindBy(css="#list-a > li:nth-child(4) > a")
	WebElement waysToBank;
	
	@FindBy(css="#navbar > ul > li.active > ul > li > ul > li:nth-child(3) > a")
	WebElement waysToBankPageValidation;
	@FindBy(css="body > div.wrapper > div.main > section:nth-child(9) > div > div > div.grid__item.lap--one-half.desk--one-half.col-right > ul > li:nth-child(1) > span > a")
	WebElement visitUsAtBranch;
	public AnEveryDayBankAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	public OurRewardAccountPage clickOnOurRewardAccount() {
		
		ourRewardAccount.click();
		return new OurRewardAccountPage();
	}
	public WaysToBankPage clickOnWaysToBank() {
		waysToBank.click();
		return new WaysToBankPage();
	}
	public VisitUsAtBranchPage clickOnVisitUsAtBranch() {
		visitUsAtBranch.click();
		return new VisitUsAtBranchPage();
	}
	

}
