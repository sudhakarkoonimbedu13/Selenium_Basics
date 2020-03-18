// Need to check at home

package com.qtpselenium.demo1;

import java.io.File;
import java.io.IOException;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class URLResultsStatus {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
	   
	   FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		
	   Proxy proxy = new Proxy();
	   proxy.setProxyAutoconfigUrl("http://dstwsproxy.dstcorp.net:8081/accelerated_pac_base.pac");
	   
	   DesiredCapabilities cap = new DesiredCapabilities().firefox();
	   cap.setCapability(CapabilityType.PROXY, proxy);
	   cap.setCapability(FirefoxDriver.BINARY,binary);
   
	   driver = new FirefoxDriver(cap);
	   
	   String strURL = "https://www.google.com/";
	   
	   driver.get(strURL);
	   
	   checkResultsStatusCode(strURL);  
	   

	}
	
	
 public static boolean checkResultsStatusCode(String strURL) throws IOException
	{
//		try
//		{
			int code = Request.Get(strURL).execute().returnResponse().getStatusLine().getStatusCode();
			if(code == 200)
			{
				System.out.println("Status is OK and the Response code is --> "+code);
				return true;
			}
			else
			{
		    	System.out.println("Some thing was wrong with the URL "+strURL);
		    	return false;
			}
//		}
//		catch(Exception e){  
//		return false;
//	    }
		
   }
 
}
