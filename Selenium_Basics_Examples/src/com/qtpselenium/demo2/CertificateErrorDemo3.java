package com.qtpselenium.demo2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CertificateErrorDemo3 
{
   public static WebDriver driver;
   
   public static void main(String[] args) throws InterruptedException 
   {
	   FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
		//FirefoxProfile pr = new FirefoxProfile();
		
		//pr.setAcceptUntrustedCertificates(true);
		
		//pr.setAssumeUntrustedCertificateIssuer(false);
		
		driver = new FirefoxDriver(binary,null);
		
	       
		driver.get("https://badssl.com/");
			
		driver.findElement(By.linkText("untrusted-root")).click();
		Thread.sleep(3000);

	}

}
