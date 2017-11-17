package com.Rbs.Pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rbs.TestBase.TestBase;
import com.Rbs.Utility.Util;

public class BookABranchAppointmentPage extends TestBase{

	@FindBy(css="#postcodeTF")
	WebElement postCode;
	@FindBy(css="#lnkFindBranch")
	WebElement findBranch;
	@FindBy(css="#branchListContainer > ul:nth-child(1) > li.selectedListItem.bold > span")
	WebElement dalkeithBBranch;
	@FindBy(css="#blrNext")
	WebElement nextButton;
	@FindBy(xpath="//tbody/tr/td/input[@onclick='setSelectedAppointmentTime(this)")
	WebElement slotList;
	
	public BookABranchAppointmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPostCodeAndFindBranch() {
		postCode.sendKeys("EH22 2SB");
		findBranch.click();
		Util.wait(50);
		dalkeithBBranch.click();
		nextButton.click();
		List<WebElement> list=driver.findElements(By.xpath("//tbody/tr/td/input[@onclick='setSelectedAppointmentTime(this)']"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Random rand=new Random();
			int randomValue=rand.nextInt(list.size());
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			WebElement list1=list.get(randomValue);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			list1.click();
		
		
	}
}
