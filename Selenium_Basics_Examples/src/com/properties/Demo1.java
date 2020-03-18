package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 
{

	public static void main(String[] args) throws IOException 
	{
		Properties pf = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Credentials.properties");
		
		pf.load(fis);
		
		System.out.println(pf.getProperty("strUername"));
		System.out.println(pf.getProperty("strURL"));
		
		pf.setProperty("strUpdatedRegion", "RX2");
		pf.setProperty("strUpdatedURL", "https://google.com");
		pf.setProperty("strUpdatedUserName", "https1");
		pf.setProperty("strUpdatedPassword", "https2");
		
		FileOutputStream ois = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Credentials.properties");
		
		pf.store(ois,"Added by Sudhakar");

	}

}
