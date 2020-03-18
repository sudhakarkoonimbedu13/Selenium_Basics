package com.qtpselenium.demo3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadDemo5 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).click();
		
		Thread.sleep(2000);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_SHIFT);
	    rb.keyPress(KeyEvent.VK_SEMICOLON);
	    rb.keyRelease(KeyEvent.VK_SEMICOLON);
	    rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_N);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_X);
		rb.keyRelease(KeyEvent.VK_X);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	
		
	}

}
