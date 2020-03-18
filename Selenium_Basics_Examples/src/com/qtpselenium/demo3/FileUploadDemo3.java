package com.qtpselenium.demo3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,null);
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uploadfile_0")).click();
		
		Thread.sleep(2000);
		
		// Process process = new ProcessBuilder("D:\\Auto IT\\Programs\\FileUploadDemo3.exe","C:\\Users\\dt204684\\Desktop\\test123.txt","Open").start();
                                          
		                                    //  or
		
		String strCommand = "D:\\Auto IT\\Programs\\FileUploadDemo3.exe "+"C:\\Users\\dt204684\\Desktop\\test123.txt";
		java.lang.Runtime.getRuntime().exec(strCommand);
	}

}
