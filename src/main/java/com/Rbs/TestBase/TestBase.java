package com.Rbs.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Rbs.Utility.Util;
import com.Rbs.Utility.WebEventListener;

public class TestBase {
	
	EventFiringWebDriver e_driver;
	WebEventListener eventListener;
    public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		prop=new Properties();
		File file=new File("C:\\Madhuri\\Software\\RBSMavenProject\\src\\main\\java\\com\\Rbs\\Properties\\config.properties");
		FileInputStream fis;
		
			fis = new FileInputStream(file);
			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	public void initialization() {
		String browserName=prop.getProperty("Browser");
	     if(browserName.equalsIgnoreCase("chrome")) {
	    	 System.setProperty("webdriver.chrome.driver","C:\\Madhuri\\Software\\Selinium\\chromedriver.exe");
	    	  driver=new ChromeDriver();
	     }else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Madhuri\\Software\\Selinium\\geckodriver.exe");
				 driver=new FirefoxDriver();
	     }else if(browserName.equalsIgnoreCase("internetExplorer")) {
				System.setProperty("webdriver.ie.driver", "C:\\Madhuri\\Software\\Selinium\\InternetExplorerdriver.exe");
				 driver=new InternetExplorerDriver();
			}
	     
	     e_driver=new EventFiringWebDriver(driver);;
	     eventListener=new WebEventListener();
	     e_driver.register(eventListener);
	     driver=e_driver;
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(Util.pageLoadTimeOut,TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(Util.implicitWaits, TimeUnit.SECONDS);
	     driver.get(prop.getProperty("url"));
	     
	}

}
