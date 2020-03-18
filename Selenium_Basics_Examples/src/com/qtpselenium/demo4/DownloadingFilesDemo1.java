package com.qtpselenium.demo4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadingFilesDemo1 {

	public static void main(String[] args) 
	{
		FirefoxProfile pr = new FirefoxProfile();
		
		pr.setPreference("browser.download.folderList",2);
		pr.setPreference("browser.download.dir","D:\\Download");
		pr.setPreference("browser.helperApps.neverAsk.saveToDisk","application/vnd.openxmlformats-officedocument.wordprocessingml.document,	application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.ms-excel"); // application/msword,application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		WebDriver driver = new FirefoxDriver(binary,pr);
		
		driver.get("http://qtpselenium.com/test/testdownload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/a[1]")).click();
		driver.findElement(By.xpath("html/body/a[2]")).click();
		driver.findElement(By.xpath("html/body/a[4]")).click();

	}

}
