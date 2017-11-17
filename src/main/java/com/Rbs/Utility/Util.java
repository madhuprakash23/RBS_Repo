package com.Rbs.Utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Rbs.TestBase.TestBase;

public class Util extends TestBase{

	public static int implicitWaits=30;
	public static int pageLoadTimeOut=30;
	public static String postCode="EH22 2SB";
	
	public static void wait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
    public static void explicitWait(long eWait,String xpathExpression) {
    	WebDriverWait wait=new WebDriverWait(driver,eWait);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
    }
    
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	
	Util.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	
	}

private static void copyFile(File scrFile, File file) {
	// TODO Auto-generated method stub
	
}
}


