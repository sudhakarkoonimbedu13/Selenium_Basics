package com.qtpselenium.demo3;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDemo1 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws ParseException, InterruptedException 
	{
		
		String travellDate = "21/12/2019";
		String months[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d = df.parse(travellDate);
		Calendar cal = Calendar.getInstance();
	    cal.setTime(d);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    System.out.println(day);
	    int month = cal.get(Calendar.MONTH);
	    System.out.println(months[month]);	    
	    int year = cal.get(Calendar.YEAR);
	    System.out.println(year);
	    
	    String reqMonthYerar = months[month]+" "+year;
		
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		driver = new FirefoxDriver(binary,null);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/online-booking/apsrtc.aspx?gclid=EAIaIQobChMI8uGSsoiV3wIVCxhpCh1cTQbMEAAYASAAEgK8u_D_BwE");
		driver.manage().window().maximize();
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();	
		selectMonth(reqMonthYerar);
		selectDate(day);
		
	}
	
	public static void selectMonth(String reqMonthYear) throws InterruptedException
	{
		String availableMonth = driver.findElement(By.xpath("//div[@id='onward']//following-sibling::div[@id='rb-calmiddle']/div/ul/li[3]/div[1]/span[@id='rb-month']")).getText();
		
		String availableYear = driver.findElement(By.xpath("//div[@id='onward']//following-sibling::div[@id='rb-calmiddle']/div/ul/li[3]/div[2]/span[@id='rb-year']")).getText();
		
		String availableMonthYear = availableMonth+" "+availableYear;
		
		while(!reqMonthYear.equals(availableMonthYear))
		{			
			driver.findElement(By.xpath("//div[@class='clearfix rb-calendar-main']/div/div[2]/div[2]/div/ul/li[1]/img")).click();
			Thread.sleep(1000);
			availableMonth = driver.findElement(By.xpath("//div[@id='onward']//following-sibling::div[@id='rb-calmiddle']/div/ul/li[3]/div[1]/span[@id='rb-month']")).getText();
			
			availableYear = driver.findElement(By.xpath("//div[@id='onward']//following-sibling::div[@id='rb-calmiddle']/div/ul/li[3]/div[2]/span[@id='rb-year']")).getText();
			
			availableMonthYear = availableMonth+" "+availableYear;
		}		
	}
	
	public static void selectDate(int reqDay)
	{
		String part1 = "//div[@class='clearfix rb-calendar-main']//following-sibling::div[@id='rb-calmiddle']/ul[@class='rb-calendar-days']/li[";
		String part2 = "]/span";
		int linkCount = driver.findElements(By.xpath("//div[@class='clearfix rb-calendar-main']//following-sibling::div[@id='rb-calmiddle']/ul[@class='rb-calendar-days']/li")).size();
		for(int linkNum=0;linkNum<linkCount;linkNum++)
		{
			if (driver.findElements(By.xpath(part1+linkNum+part2)).size()>0)
			{
				
			    String date = driver.findElement(By.xpath(part1+linkNum+part2)).getText();
				if(!date.isEmpty())
				{
					int date1 = Integer.parseInt(date);
					
  				    if(reqDay==date1)
					 {
  				    	driver.findElement(By.xpath(part1+linkNum+part2)).click();
						return;
						
					 }
				}
			}
		}
	}

}
