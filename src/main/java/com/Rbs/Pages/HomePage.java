package com.Rbs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Rbs.TestBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement products;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public PersonalProductPage clickOnProductsLink() {
		products.click();
		return new PersonalProductPage();
	}
}
