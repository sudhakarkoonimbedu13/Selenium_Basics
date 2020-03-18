package com.advanceduserinteractions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6);		
		
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp = pr.getProfile("User1");		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		FirefoxDriver driver = new FirefoxDriver(binary,fp);
		driver.get("https://dev-web/sso-web/login.jsf?");
		Thread.sleep(5000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("*[id='loginForm:principal']")).sendKeys("qtpdr");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id='loginForm:principal']")).clear();
		Thread.sleep(3000);
		String strComponentName = driver.findElement(By.cssSelector("h1#componentName")).getText();
		System.out.println(strComponentName);		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id^='loginForm:prin']")).sendKeys("qtpdr2");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id='loginForm:principal']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id$='principal']")).sendKeys("qtpdr3");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id='loginForm:principal']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id*='inForm:prin']")).sendKeys("qtpdr4");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("*[id='loginForm:principal']")).clear();
		String strComponentName1 = driver.findElement(By.cssSelector("h1:contains('RxNova')")).getText();
		System.out.println(strComponentName1);
	}

}
