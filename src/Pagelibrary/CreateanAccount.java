package Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateanAccount {
	WebDriver wd;
	
	WebElement selectgenderradio = wd.findElement(By.xpath("//input[@id='id_gender1']"));
	WebElement Firstname = wd.findElement(By.xpath("customer_firstname"));
	WebElement Lastname = wd.findElement(By.xpath("customer_lastname"));
	WebElement emailaddess= wd.findElement(By.xpath(".//*[@id='email']"));
	WebElement password = wd.findElement(By.id("passwd"));
	WebElement days= wd.findElement(By.xpath("//select[@id='days']"));
	WebElement month= wd.findElement(By.xpath(".//*[@id='months']"));
	WebElement years = wd.findElement(By.xpath(".//*[@id='years']"));
	
	/* address locaters*/
	
	WebElement addr_firstname=wd.findElement(By.xpath("//input[@id='firstname']"));
	WebElement addr_lastname= wd.findElement(By.xpath("//input[@id='lastname']"));
	WebElement add_company= wd.findElement(By.xpath("company"));
	WebElement add_addr1=wd.findElement(By.id("address1"));
	WebElement add_addr2=wd.findElement(By.xpath(".//*[@id='address2']"));
	WebElement addr_city=wd.findElement(By.id("city"));
	WebElement addr_state=wd.findElement(By.xpath(".//*[@id='id_state']"));
	WebElement zipcode=wd.findElement(By.xpath(".//*[@id='postcode']"));
	WebElement country=wd.findElement(By.xpath(".//*[@id='id_country']"));
	WebElement home_phone=wd.findElement(By.xpath(".//*[@id='phone']"));
	WebElement mobile_phone=wd.findElement(By.xpath(".//*[@id='phone_mobile']"));
	WebElement alias_email= wd.findElement(By.xpath(".//*[@id='alias']"));
	
	WebElement register=wd.findElement(By.xpath(".//*[@id='submitAccount']"));
	
	
	public void selectgender(){
		selectgenderradio.click();
	}
	public void enterfirstname(String firstname){
		Firstname.sendKeys(firstname);
	}
	public void enterlastname(String Lastname){
		this.Lastname.sendKeys(Lastname);
	}
	public void enteremailaddess(String email){
		emailaddess.sendKeys(email);
	}
	public void enterpassword(String password){
		this.password.sendKeys(password);
	}
	public void selectdays(String value){
		Select oSelect = new Select(days);
		oSelect.selectByValue(value);
	}
	public void selectmonth(String monthv){
		Select mselect= new Select(month);
		mselect.selectByValue(monthv);
	}
	public void selectyear(String year){
		Select yselect= new Select(years);
		yselect.selectByVisibleText(year);
	}
	public void enteraddfirstname(String addrfirstname){
		addr_firstname.sendKeys(addrfirstname);
	}
	public void enteraddrlastname(String addrlastname){
		addr_lastname.sendKeys(addrlastname);
	}
	public void entercompeny(String addrcompany){
		add_company.sendKeys(addrcompany);
	}
	public void enteraddress1(String addr1){
		add_addr1.sendKeys(addr1);
	}
	public void enteraddr2(String addr2){
		add_addr2.sendKeys(addr2);
	}
	public void addrcity(String acity){
		addr_city.sendKeys(acity);
	}
	public void addrstate(String astate){
		addr_state.sendKeys(astate);
	}
	
	public void enterzip(String zip){
		zipcode.sendKeys(zip);
	}
	public void entercountry(String country){
		this.country.sendKeys(country);
	}
	public void enterhomephone(String phone){
		this.home_phone.sendKeys(phone);
	}
	public void entermobilephone(String mobilephone){
		this.mobile_phone.sendKeys(mobilephone);
	}
	public void enteraliasemail(String aliasemail){
		this.alias_email.sendKeys(aliasemail);
	}
	public void clickonregister(){
		register.click();
	}
	
}
