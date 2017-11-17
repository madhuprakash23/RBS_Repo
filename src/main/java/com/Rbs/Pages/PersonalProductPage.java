package com.Rbs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Rbs.TestBase.TestBase;
import com.Rbs.Utility.Util;

public class PersonalProductPage extends TestBase{

	@FindBy(xpath="//a[@title='An everyday bank account']")
	WebElement aneverydaybankaccount;
	
	public PersonalProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AnEveryDayBankAccountPage clickOnAnEverydayBankAccount() {
		//Util.wait(30);
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='An everyday bank account']")));
//		aneverydaybankaccount.
		Util.explicitWait(30, "//a[@title='An everyday bank account']");
		aneverydaybankaccount.click();
		return new AnEveryDayBankAccountPage();
	}
	
}
