package DataDriverTesting_JUnit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoToursTesting_ErrorCollector 
{
	private WebDriver driver;	
	
	@Before
    public void launchDemoTours() throws IOException
    {
		utils util = new utils();
		
		if (util.isSkipTest("DemoToursTesting_ErrorCollector"))
		 {
			Assume.assumeTrue(false);
		 }
		
		FirefoxBinary bin = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(bin,null);
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();		
    }
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Test
	public void linksTest()
	{
		String xpath1 = "html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[";
		String xpath2 = "]/td[2]";
		
		int i=0;
		
		for(i=0;i<=6;i++)
		{
		
		try
		 {
			String linkText = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
	        System.out.println(linkText);				
			driver.findElement(By.xpath(xpath1+i+xpath2)).click();
		 }
		
		catch(Throwable t)
		 {
			utils.screenshot(driver,"DemoTours_"+i);
			ec.addError(t);
		 }
	  }
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
}
