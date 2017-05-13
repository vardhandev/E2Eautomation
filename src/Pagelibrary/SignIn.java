package Pagelibrary;




import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.istack.internal.logging.Logger;

public class SignIn {
	WebDriver wd;

	//static Logger log = Logger.getLogger(SignIn.class.getName(), null);
	By Signinbutton_top = By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By createmailadd = By.xpath(".//*[@id='email_create']");
	By alreadyregemail= By.xpath(".//*[@id='email']");
	By aslreadypassword =  By.xpath(".//*[@id='passwd']");
	By loginsign = By.xpath(".//*[@id='SubmitLogin']");
	
	/* This method is to click on sign in link on top*/
	
	public SignIn(WebDriver wd){
		this.wd = wd;
	}
	
	public void Signinbutton_top(){
		//log.info("click on signin button");
		wd.findElement(Signinbutton_top).click();
	}
	public void enteremailforcreateaccount(String emailAddress){
		//log.info("enter email address to create the account");
		wd.findElement(createmailadd).sendKeys(emailAddress);
	}
	
	public void enteralreadyregisteremail(String emailAddress){
		//log.info("enter email address to login");
		wd.findElement(alreadyregemail).sendKeys(emailAddress);
		
	}
	
	public void enteralreadypassword(String password){
		//log.info("enter password to login");
		wd.findElement(aslreadypassword).sendKeys(password);
	}
	
	public void clickonlogin(){
	//	log.info("click on sign in");
		wd.findElement(loginsign).click();
	}
	public void clickoncreateaccount(){
		//log.info("click on create account");
		wd.findElement(createmailadd).click();
	}
	
	public String getpagetitle(){
		String page_title = wd.getTitle();
		return page_title;
	}
	
	public void loginyoapp() throws InterruptedException{
		  Signinbutton_top();
		  Thread.sleep(10);
		  enteralreadyregisteremail("test@gmail.com");
		  enteralreadypassword("tester123");
		  clickonlogin();
	}
}
