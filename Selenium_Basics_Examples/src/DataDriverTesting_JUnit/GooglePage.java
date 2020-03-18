package DataDriverTesting_JUnit;

import java.io.File;
import java.io.IOException;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePage 
{
  static WebDriver driver;
  
  @Before
  public void navigateToGoogle() throws IOException
  {
	  utils util = new utils(); 
	  
	  if(util.isSkipTest("GooglePage"))
	   {
		   Assume.assumeTrue(false);
	   }
	  
	   FirefoxBinary bin = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
	   driver = new FirefoxDriver(bin,null);
	   
	   driver.get("http://google.com");
  }
  
  @Test
  public void getPageTitle()
     {	  
       System.out.println(driver.getTitle());
       driver.close();

	 }

}
