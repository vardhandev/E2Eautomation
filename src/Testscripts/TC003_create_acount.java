package Testscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.sun.org.apache.xml.internal.security.Init;

import Pagelibrary.CreateanAccount;
import Pagelibrary.SignIn;
import Testbase.Testbase;

public class TC003_create_acount extends Testbase{
	
	SignIn SignIn;
	CreateanAccount createaccount;
	String emailAddress="vardhan"+System.currentTimeMillis()+"@gmail.com";
	String firstname = "rk";
	String lastname = "vardh";
	
  @Test
  public void createaccount() throws InterruptedException {
	  SignIn =new SignIn(wd);
	  createaccount = new CreateanAccount(wd);
	  SignIn.Signinbutton_top();
	  Thread.sleep(10);
	  SignIn.enteremailforcreateaccount(emailAddress);
	  SignIn.clickoncreateaccount();
	  waitfor(10);
	  System.out.println("Waiting for 10 ms");
	  createaccount.titledisplayed();
	  createaccount.selectgender();
	  createaccount.enterfirstname(firstname);
	  createaccount.enterlastname(lastname);
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  init();
  }

  @AfterClass
  public void afterClass() {
  }

}
