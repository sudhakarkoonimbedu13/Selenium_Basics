package com.qtpselenium.demo3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).click();
		
		Thread.sleep(2000);
		
		Robot rb = new Robot();
		
		
		setFilePath("C:\\Users\\dt204684\\Desktop\\test123.txt");
		
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
}
	
	public static void setFilePath(String strFilePath)
	{
		StringSelection ss = new StringSelection(strFilePath);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);
	}

}
