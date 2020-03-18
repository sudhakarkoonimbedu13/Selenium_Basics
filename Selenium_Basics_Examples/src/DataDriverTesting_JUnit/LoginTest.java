package DataDriverTesting_JUnit;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class LoginTest 
{
   
   public static WebDriver driver = null;
   public String userName,password;
   
   public LoginTest(String userName,String password)
   {
	   this.userName = userName;
	   this.password = password;
   }   

   @Before
   public void beforeLaunch() throws IOException
   {
		  utils util = new utils();
		  
		  driver = utils.getDriver();
		  
		  if(util.isSkipTest("LoginTest"))
		   {
			   Assume.assumeTrue(false);
		   }
   }
   
   
   @Test
   public void launchApplication()
   {
	   //FirefoxBinary bin = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
	   //driver = new FirefoxDriver(bin,null);
	   
	   driver.get("https://dev-web/sso-web/login.jsf?");
	   
	   driver.findElement(By.id("loginForm:principal")).sendKeys(userName);
	   driver.findElement(By.id("loginForm:credentials")).sendKeys(password);
	   driver.findElement(By.id("loginForm:credentials")).sendKeys(Keys.ENTER);
	   driver.close();
   }
   
   @Parameters
   public static Collection<Object[]> readData() throws IOException
   {
//	   Object[][] data = new Object[2][2];
//	   
//	   // 1st Row
//	   data[0][0] = "qtpdr11";
//	   data[0][1] = "1234";
//	   
//	   // 2nd Row
//	   data[1][0] = "qtpdr12";
//	   data[1][1] = "1234";
//	   
//	   return Arrays.asList(data);
	   
	   utils util = new utils();
	   
	   Object[][] data = util.getData(System.getProperty("user.dir")+"//TestData//DataDrivenTesting.xlsx");
	   
//	   Object[][] data = utils.getData1("LoginTest");
	   
	   return Arrays.asList(data);
   }
   
}
