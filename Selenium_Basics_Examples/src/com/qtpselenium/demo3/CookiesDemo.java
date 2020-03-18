package com.qtpselenium.demo3;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesDemo 
{

	public static void main(String[] args) 
	{
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("https://google.com");
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		Iterator<Cookie> it = cookie.iterator();
		
		while(it.hasNext())
		{
			Cookie c = it.next();
			
			System.out.println(c.getDomain()+" ********** "+c.getName()+" ********* "+c.getValue());
		}

	}

}
