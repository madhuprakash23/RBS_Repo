package com.Rbs.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rbs.TestBase.TestBase;
import com.Rbs.Utility.Util;

public class VisitUsAtBranchPage extends TestBase {

	@FindBy(css = "#postcodeTF")
	WebElement postcode;
	@FindBy(css = "#lnkFindBranch")
	WebElement findBranch;
	@FindBy(xpath = "//li[@class='selectedListItem bold']/span")
	WebElement dalkeithBranch;
	@FindBy(css = "#blrNext")
	WebElement nextButton;

	public VisitUsAtBranchPage() {
		PageFactory.initElements(driver, this);
	}

	public void handleNewWindow() {

		Set<String> handler = driver.getWindowHandles();
		Iterator it = handler.iterator();
		String parentHandler = (String) it.next();
		String childHandler = (String) it.next();
		driver.switchTo().window(childHandler);
		postcode.sendKeys(Util.postCode);
		findBranch.click();
		dalkeithBranch.click();
		nextButton.click();
		for (int i = 2; i <= 8; i++) {
			for (int j = 1; j <= 6; j++) {
				Random random = new Random();
				List<WebElement> list = driver.findElements(By
						.xpath("//tbody/tr[" + i + "]/td[" + j + "]/input[@onclick='setSelectedAppointmentTime(this)']"));
				
				list.get(random.nextInt(list.size())).click();
		
				// }
			}
		}

		// driver.close();
		// driver.switchTo().window(parentHandler);
		//

	}
}
