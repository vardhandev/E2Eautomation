package Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pagelibrary.SignIn;

import com.sun.istack.internal.logging.Logger;
import com.sun.jna.platform.win32.Netapi32Util.User;

public class Testbase {
	
		
	
	String driverPath = "F:\\seleniumlib\\";
	
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream f1;
	public WebDriver wd;

	//static Logger log = Logger.getLogger(Testbase.class.getName(), null);
	
	
	public void loadpropeties() throws IOException{
		//log.info("this method to load the properties");
		//System.out.println("init method is callled from testbase class");
		//f= new File("C:\\Users\\lenovo\\workspace\\Framework\\src\\config\\config.properties");
		
		File f= new File(System.getProperty("user.dir")+"\\src\\config\\config.properties");
		FileReader obj1= new FileReader(f);
		//properties.load(obj1);
		//System.out.println("Hello");
		//f1 = new FileInputStream(f);
		Repository.load(obj1);
	}
	
	public void init() throws IOException{
		//log.info("this mehod for inititaion");
		loadpropeties();
		//System.out.println("load preperties method is called");
		//selectbrowser(Repository.getProperty("browser"));
		selectbrowser(Repository.getProperty("browser"));
		//System.out.println("browser called from config repo");
		//wd.get(Repository.getProperty("url"));
		wd.get(Repository.getProperty("url"));
		
	}
	
	public WebDriver selectbrowser(String browser){
		
		if(browser.equals("firefox") || browser.equals("FIREFOX")){
		wd= new FirefoxDriver();
		wd.manage().window().maximize();
		return wd;
		}
		if(browser.equals("chrome") || browser.equals("CHROME")){
			
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			wd.manage().window().maximize();
			return wd;
		}
		if(browser.equals("internetexplorere") || browser.equals("INTERNET")){
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			wd.manage().window().maximize();
			return wd;
		}
		return null;
		
	}
	
}
