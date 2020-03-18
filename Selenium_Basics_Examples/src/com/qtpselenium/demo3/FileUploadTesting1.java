package com.qtpselenium.demo3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FileUploadTesting1 {
	
    public static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		Scanner sc = new Scanner(System.in);
		
		String inputDriver = sc.nextLine();
		
		if(inputDriver.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if(inputDriver.equalsIgnoreCase("ie"))
		{
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
		
		driver.get("C:\\Users\\dt204684\\Desktop\\FileUpload.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='resumeupload' and @type='file']")).click();
		
		Thread.sleep(5000);
		
//		java.lang.Runtime.getRuntime().exec("D:\\Auto IT\\Programs\\FileUploadTesting.exe");
		
		Robot rb = new Robot();
		
		StringSelection str1 = new StringSelection("C:\\TempAutomation\\KeywordDriven\\TestData\\TD_Preload_Automation.xls");
		
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		cb.setContents(str1, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
         
	}

}
