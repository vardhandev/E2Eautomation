package Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	WebDriver wd;
	String driverPath = "F:\\seleniumlib\\";
	
	public void seletbrowser(String browser){
		if(browser.equals("firefox") || browser.equals("FIREFOX")){
		wd= new FirefoxDriver();
		wd.manage().window().maximize();
		}
		if(browser.equals("chrome") || browser.equals("CHROME")){
			
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			wd.manage().window().maximize();
		}
		if(browser.equals("internetexplorere") || browser.equals("INTERNET")){
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			wd.manage().window().maximize();
		}
		
		
	}
	
}
