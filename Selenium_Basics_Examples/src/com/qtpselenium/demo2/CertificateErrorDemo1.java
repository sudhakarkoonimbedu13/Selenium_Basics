package com.qtpselenium.demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CertificateErrorDemo1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		//driver.get("https://dev-web/sso-web/login.jsf");
		
		driver.get("https://badssl.com/");
		
		driver.findElement(By.linkText("untrusted-root")).click();		
		
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");

	}

}
