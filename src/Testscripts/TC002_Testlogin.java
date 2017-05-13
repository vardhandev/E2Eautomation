package Testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import Testbase.Testbase;

public class TC002_Testlogin extends Testbase {
	Pagelibrary.SignIn SignIn; 
	
	
	
  @Test
  public void testlogin() throws InterruptedException {
	  
	  System.out.println("Hello");
	  SignIn = new Pagelibrary.SignIn(wd);
	  SignIn.loginyoapp();
	  String Actual_value = SignIn.getpagetitle();
	  Assert.assertEquals(Actual_value, "Login - My Store");
	  

  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  
	  init();
  }

  @AfterClass
  public void afterClass() {
	  //wd.close();
	  
  }

}
