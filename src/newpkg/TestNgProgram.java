package newpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgProgram {
 
  @BeforeMethod
  public void m1() {
	 
	  {
		  System.out.println("hi");
		  System.out.println("Hello");
	  }
  }

  @AfterMethod
  public void m2() {
	  System.out.println("Great");
  }
  @Test(priority=-1)
	  public void m4() {
		  System.out.println("Ganesh");
	  }
  @Test(priority=2)
  public void m5() {
	  System.out.println("Rekh");
	  
  }
  @Test(priority=0)
  public void m6(){
	  System.out.println("Kiran");
  }



}
