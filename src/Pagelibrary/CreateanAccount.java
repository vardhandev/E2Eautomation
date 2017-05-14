package Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateanAccount {
	WebDriver wd;
	
	By selectgenderradio = By.xpath(".//*[@id='account-creation_form']/div[1]/div[1]/div[1]/label");
	By Firstname = By.xpath("customer_firstname");
	By Lastname = By.xpath("customer_lastname");
	By emailaddess= By.xpath(".//*[@id='email']");
	By password = By.id("passwd");
	By days= By.xpath("//select[@id='days']");
	By month= By.xpath(".//*[@id='months']");
	By years = By.xpath(".//*[@id='years']");
	
	/* address */
	
	By addr_firstname=By.xpath("//input[@id='firstname']");
	By addr_lastname= By.xpath("//input[@id='lastname']");
	By add_company= By.xpath("company");
	By add_addr1=By.id("address1");
	By add_addr2=By.xpath(".//*[@id='address2']");
	By addr_city=By.id("city");
	By addr_state=By.xpath(".//*[@id='id_state']");
	By zipcode=By.xpath(".//*[@id='postcode']");
	By country=By.xpath(".//*[@id='id_country']");
	By home_phone=By.xpath(".//*[@id='phone']");
	By mobile_phone=By.xpath(".//*[@id='phone_mobile']");
	By alias_email= By.xpath(".//*[@id='alias']");
	
	By register=By.xpath(".//*[@id='submitAccount']");
	
	public CreateanAccount(WebDriver wd){
		this.wd = wd;
	}
	
	
	public void selectgender(){
		
		wd.findElement(selectgenderradio).click();
		System.out.println("clickked on select gender");
	}
	public void enterfirstname(String firstname){
		wd.findElement(Firstname).sendKeys(firstname);
	}
	public void enterlastname(String Lastname){
		wd.findElement(this.Lastname).sendKeys(Lastname);
	}
	public void enteremailaddess(String email){
		wd.findElement(emailaddess).sendKeys(email);
	}
	public void enterpassword(String password){
		wd.findElement(this.password).sendKeys(password);
	}
	public void selectdays(String value){
		Select oSelect = new Select(wd.findElement(days));
		oSelect.selectByValue(value);
	}
	public void selectmonth(String monthv){
		Select mselect= new Select(wd.findElement(month));
		mselect.selectByValue(monthv);
	}
	public void selectyear(String year){
		Select yselect= new Select(wd.findElement(years));
		yselect.selectByVisibleText(year);
	}
	public void enteraddfirstname(String addrfirstname){
		wd.findElement(addr_firstname).sendKeys(addrfirstname);
	}
	public void enteraddrlastname(String addrlastname){
		wd.findElement(addr_lastname).sendKeys(addrlastname);
	}
	public void entercompeny(String addrcompany){
		wd.findElement(add_company).sendKeys(addrcompany);
	}
	public void enteraddress1(String addr1){
		wd.findElement(add_addr1).sendKeys(addr1);
	}
	public void enteraddr2(String addr2){
		wd.findElement(add_addr2).sendKeys(addr2);
	}
	public void addrcity(String acity){
		wd.findElement(addr_city).sendKeys(acity);
	}
	public void addrstate(String astate){
		wd.findElement(addr_state).sendKeys(astate);
	}
	
	public void enterzip(String zip){
		wd.findElement(zipcode).sendKeys(zip);
	}
	public void entercountry(String country){
		wd.findElement(this.country).sendKeys(country);
	}
	public void enterhomephone(String phone){
		wd.findElement(this.home_phone).sendKeys(phone);
	}
	public void entermobilephone(String mobilephone){
		wd.findElement(this.mobile_phone).sendKeys(mobilephone);
	}
	public void enteraliasemail(String aliasemail){
		wd.findElement(this.alias_email).sendKeys(aliasemail);
	}
	public void clickonregister(){
		wd.findElement(register).click();
	}
	public void titledisplayed(){
		wd.findElement(By.xpath(".//*[@id='account-creation_form']/div[1]/div[1]/label")).isDisplayed();
	}
	
}
