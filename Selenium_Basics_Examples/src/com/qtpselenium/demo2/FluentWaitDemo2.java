package com.qtpselenium.demo2;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class FluentWaitDemo2 
  {
    static WebDriver driver;
	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
		driver = new FirefoxDriver(binary,null);
		
		driver.get("C:\\Users\\dt204684\\Desktop\\FluentWaitDemo.html");
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		                 
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(20,TimeUnit.SECONDS);
		wait.pollingEvery(2, TimeUnit.SECONDS);
		
		Function<WebDriver,WebElement> function = new Function<WebDriver, WebElement>()
			{
			  public WebElement apply(WebDriver arg0)
			  {
				  WebElement element =  arg0.findElement(By.cssSelector("p#dynamicText"));
				  
				  if(element!=null)
				  {
					  System.out.println("The dynamic object is displayed");
				  }
				  
				  return element;			  
				  
			  }
			};
		
		wait.until(function);
	}

}
