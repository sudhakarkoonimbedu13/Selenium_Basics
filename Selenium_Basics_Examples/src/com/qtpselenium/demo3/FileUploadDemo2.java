package com.qtpselenium.demo3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).click();
		
		Thread.sleep(2000);
		
		// Process process = new ProcessBuilder("D:\\Auto IT\\Programs\\FileUploadDemo2.exe","","Open").start();
		
		                 // or
        java.lang.Runtime.getRuntime().exec("D:\\Auto IT\\Programs\\FileUploadDemo2.exe");
        
	}

}
