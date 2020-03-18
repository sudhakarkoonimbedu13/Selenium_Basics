package com.advanceduserinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo1 {
	
	public static WebDriver driver;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException 
	{
				
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		// driver = new ChromeDriver();
		
		//FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
		
		//driver = new FirefoxDriver(binary,null);
		
		ProfilesIni pf = new ProfilesIni();
		
		FirefoxProfile fp = pf.getProfile("User1");
		
		driver = new FirefoxDriver(fp);		
		
		Proxy proxy = new Proxy();
		
		proxy.setProxyAutoconfigUrl("");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.BROWSER_NAME,"firefox");
		
		cap.setCapability(CapabilityType.PROXY, proxy);		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		if(driver.findElements(By.linkText("NO, THANKS")).size()>0)
		{
			driver.findElement(By.linkText("NO, THANKS")).click();
		}
		
		wait = new WebDriverWait(driver,60);
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		// Move To Element
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-label='Search by voice']")));
		
		WebElement moveToElement = driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
		
		action.moveToElement(moveToElement).build().perform();
		
		Thread.sleep(4000);
		
		// Click at current mouse location
		
		action.click().build().perform();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		
		// Click
		
		WebElement sendKeys = driver.findElement(By.id("lst-ib"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));	
		
		
		action.click(sendKeys).build().perform();
		
		// Send Keys		
		
		action.sendKeys("Hello Google").build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("lst-ib")).clear();
		
		// Key Down
		
		action.keyDown(Keys.SHIFT).build().perform();
		
		action.sendKeys(sendKeys,"Hello Google").build().perform();
		
		action.release();
		
		// Double Click
		
		//action.doubleClick(sendKeys).build().perform();
		
		//Thread.sleep(3000);
		
		// Key Down
		
		//action.contextClick().build().perform();
		
		Thread.sleep(5000);
		
		action.click(sendKeys).build().perform();
		
		action.keyDown(sendKeys,Keys.CONTROL).sendKeys("A").build().perform();
		
		Thread.sleep(5000);
		
		action.sendKeys(sendKeys,Keys.CONTROL).sendKeys(sendKeys,"X").build().perform();
		
		//action.release();
		
		Thread.sleep(5000);
		
		action.contextClick().build().perform();
		
		action.sendKeys(sendKeys,Keys.CONTROL).sendKeys(sendKeys,"V").build().perform();
		
	}


}
