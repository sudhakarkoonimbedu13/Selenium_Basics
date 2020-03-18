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

public class FluentWaitDemo1 
{
    public static WebDriver driver;
	public static void main(String[] args) 
	{
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		driver.get("C:\\Users\\dt204684\\Desktop\\FluentWaitDemo.html");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.SECONDS);

		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver arg0) {
				WebElement element = arg0.findElement(By.id("dynamicColor"));
				String colorCode = element.getCssValue("color");
				String color = element.getAttribute("style");
				System.out.println("The button text has color and its code:" + color +" :"+colorCode);
				if (colorCode.equals("rgba(255, 255, 0, 1)") && color.contains("yellow")) {
					return true;
				}
				return false;
			}
		};

		wait.until(function);
	}

}

