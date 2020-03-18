package com.coveragecode;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverageCode2 {
	
 public static WebDriver driver;
 public static WebDriverWait wt;
 public static Properties pf = new Properties();

 public static void main(String[] args) throws Throwable 
	 {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wt= new WebDriverWait(driver,60);
		ReadProp();
		//Navigate to URL
		//driver.get("https://dev-web/sso-web/login.jsf?");come
		driver.get(pf.getProperty("strURL"));
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
		//Maximize the browser		
		driver.manage().window().maximize();
		
		String userName= pf.getProperty("strUserName");
		String password= pf.getProperty("strPassword");
		String region= pf.getProperty("strRegion");
			
		login(userName, password, region);  //login id, pswd and region
		SelectApplicationFromMenu("Plan Setup;Coverage Code");
		PageNavigation("Coverage Code");
		FrameNavigation(0);
		System.out.println("Navigated to the Coverage Code page");
			
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"//TestData//CoverageCode.xls");
		HSSFWorkbook covWb = new HSSFWorkbook(f);
		HSSFSheet covSheet = covWb.getSheet("CoverageCode");
		
		System.out.println(System.currentTimeMillis());
		int covRows = covSheet.getLastRowNum();
		for(int i=1;i<=covRows;i++)
		  {
			
			String strKeyword = covSheet.getRow(i).getCell(0).getStringCellValue();
			String strBCS = covSheet.getRow(i).getCell(1).getStringCellValue();;
			String strCustomer = covSheet.getRow(i).getCell(2).getStringCellValue();
			String strClient = covSheet.getRow(i).getCell(3).getStringCellValue();
			String strCovCode1 = covSheet.getRow(i).getCell(4).getStringCellValue();
			String strCovCode2 = covSheet.getRow(i).getCell(5).getStringCellValue(); 
			String strCopyCustomer = covSheet.getRow(i).getCell(6).getStringCellValue(); 
			String strCopyClient = covSheet.getRow(i).getCell(7).getStringCellValue();
			String strCopyCovCode1 = covSheet.getRow(i).getCell(8).getStringCellValue();
			String strCopyCovCode2 = covSheet.getRow(i).getCell(9).getStringCellValue();
			String strCopyCAId = covSheet.getRow(i).getCell(10).getStringCellValue();
			String strCopyCAName = covSheet.getRow(i).getCell(11).getStringCellValue();
			String strCopyCLId = covSheet.getRow(i).getCell(12).getStringCellValue();
			String strCopyCLName = covSheet.getRow(i).getCell(13).getStringCellValue();
			String strCopyCMId = covSheet.getRow(i).getCell(14).getStringCellValue();
			String strCopyCMName = covSheet.getRow(i).getCell(15).getStringCellValue();
			String strCopyCVId = covSheet.getRow(i).getCell(16).getStringCellValue();
			String strCopyCVName = covSheet.getRow(i).getCell(17).getStringCellValue();
			String strCopyDLId = covSheet.getRow(i).getCell(18).getStringCellValue(); 
			String strCopyDLName = covSheet.getRow(i).getCell(19).getStringCellValue();
			String strCopyDCId = covSheet.getRow(i).getCell(20).getStringCellValue(); 
			String strCopyDCName = covSheet.getRow(i).getCell(21).getStringCellValue();
			String strCopyRTId = covSheet.getRow(i).getCell(22).getStringCellValue();
			String strCopyRTName = covSheet.getRow(i).getCell(23).getStringCellValue();
				    
			System.out.println("*********************Executing with "+strKeyword+" row data****************************************");
					
			coverageCodeSearch(strBCS,strCustomer,strClient,strCovCode1,strCovCode2);
			boolean strCovCodeSuccess = coverageCodeCopy(strCopyCustomer,strCopyClient,strCopyCovCode1,strCopyCovCode2);
			if(strCovCodeSuccess==true)
		 	  {
				  navigateToCopayScreen();
				  
   				 // Copay Assignments Section
				  copyBenefitComponent("Copay Assignments",strCopyCAId,strCopyCAName);
				  
				 // Copay Limits Section
				  copyBenefitComponent("Copay Limits",strCopyCLId,strCopyCLName);
					  
					  
				 // Copay Multipliers Section
				  copyBenefitComponent("Copay Multipliers",strCopyCMId,strCopyCMName);					  
					  
				 // Copay Values Section
				  copyBenefitComponent("Copay Values",strCopyCVId,strCopyCVName);

				  updateCoverageCodeCopayDetails(strCopyCAId,strCopyCLId,strCopyCMId,strCopyCVId);
					  
				  navigateToCoverageScreen();
					  
				 // Dispensing Limits Section
				  copyBenefitComponent("Dispensing Limits",strCopyDLId,strCopyDLName);

					  
				 // Drug Coverage Section
				  copyBenefitComponent("Drug Coverage",strCopyDCId,strCopyDCName);
					  
					  
				 // Refill too soon
				  copyBenefitComponent("Refill too soon",strCopyRTId,strCopyRTName);
					  
				  updateCoverageCodeCoverageDetails(strCopyDLId,strCopyDCId,strCopyRTId);
				  
				  goToApplicationBaseState();
              }
			else
		  	 {
				  System.out.println("Failed to copy the Coverage Code...");
					  
			 }
		 }
		System.out.println(System.currentTimeMillis());
	}
 
					
//************************************Coverage Code Search********************************************************************************************************
	
	
 public static void goToApplicationBaseState() throws InterruptedException
 {
	 driver.findElement(By.linkText("Coverage Code Home")).click();
	 WaitForBusy();
 }
 
 public static void ReadProp() throws IOException
	{
		FileInputStream f1= new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Credentials.properties");
		//System.out.println(System.getProperty("user.dir") + "\\Resource\\RxNovaSettings.properties");
		pf.load(f1);		
	}		
 
 public static void coverageCodeSearch(String strBCS,String strCustomer,String strClient,String strCovCode1,String strCovCode2) throws Throwable
	 {
		 ClickOnButton(By.xpath("//span[contains(text(),'Reset')]"));
		 WaitForBusy();
	     driver.findElement(By.id("action-tag_0")).click();
		 Thread.sleep(2000);
   	     Select BCS=new Select(driver.findElement(By.id("formSearch:search_customerSet")));			
		 BCS.selectByVisibleText(strBCS);
		 WaitForBusy();
		 
		 if(!strCustomer.isEmpty())
			{
			  driver.findElement(By.id(".//*[@id='formSearch:search_tempcustomerset_select']")).sendKeys(strCustomer);
			  WaitForBusy();					
			}//Enter Customer Number
			
		  if(!strClient.isEmpty())
			{
				
			  driver.findElement(By.id(".//*[@id='formSearch:search_client_select']")).sendKeys(strClient);
			  WaitForBusy();
			}//Enter Client Number
		  
		   driver.findElement(By.xpath(".//*[@id='formSearch:search_coveragecode1']")).sendKeys(strCovCode1); //Enter Coverage Code 1
		   driver.findElement(By.xpath(".//*[@id='formSearch:search_coveragecode2']")).sendKeys(strCovCode2); //Enter Coverage Code 2
		   ClickOnButton(By.xpath(".//*[@id='formSearch:search-button']"));			  //click on Submit button
		   WaitForBusy();
		   WaitUntilWebElementExist(By.className("txt-location"));
		   if(driver.findElements(By.className("txt-location")).size()>0)
		   {
			   System.out.println("Navigates to Coverage Code Header Page");
		   }
		   else
		   {
			   System.out.println("Failed to navigate to Coverage Code Header Page");
		   }
		   
	 }
	
//************************************Coverage Code Search**********************************************************************************************************
	
//************************************Coverage Code Copy************************************************************************************************************
	 
  public static boolean coverageCodeCopy(String strNewCustomer,String strNewClient,String strNewCovCode1,String strNewCovCode2) throws Throwable
	  {
		ClickOnButton(By.id("detail-form:copy")); // click on Copy button
		WaitForBusy();
        WaitUntilWebElementExist(By.xpath(".//*[@id='copy-form:tracking-id-input']"));
        driver.findElement(By.xpath(".//*[@id='copy-form:tracking-id-input']")).sendKeys("Tracking ID1"); //Enter tracking Id
        Thread.sleep(1000);
        if(!strNewCustomer.isEmpty())
			{
	         	driver.findElement(By.id(".//*[@id= copy-form:copy-customer']")).sendKeys(strNewCustomer);
	         	WaitForBusy();					
			}//Enter Customer Number
			
		 if(!strNewClient.isEmpty())
		    {
			
			   driver.findElement(By.id(".//*[@id= copy-form:copy-client']")).sendKeys(strNewClient);
			   WaitForBusy();	
		    }//Enter Client Number
		
        driver.findElement(By.xpath(".//*[@id='copy-form:copy-coverageCode1']")).sendKeys(strNewCovCode1);  //Enter Coverage Code 1
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='copy-form:copy-coverageCode2']")).sendKeys(strNewCovCode2);   // Enter Coverage Code 2
        Thread.sleep(1000);
   	    Select Status=new Select(driver.findElement(By.id("copy-form:copy-status")));			
   	    Status.selectByVisibleText("Not Ready");
		WaitForBusy();
        ClickOnButton(By.id("copy-form:btnApply_content"));   //Click on copy button        
        WaitForBusy();
        WaitUntilWebElementExist(By.className("searchCountMessage"));		
        if(driver.findElements(By.className("searchCountMessage")).size()>0)
        {
       	  System.out.println("Coverage Code copied successfully");
       	  return true;
        }
        else
        {
       	  return false;
        }
	  }
	 
//************************************Coverage Code Copy***************************************************************************************************************
	 
	
//************************************Navigates to Copay Screen********************************************************************************************************
 public static void navigateToCopayScreen() throws InterruptedException
	{
		driver.findElement(By.linkText("Details")).click();
		WaitForBusy();
		if(driver.findElements(By.xpath("//div[@id='detail-form:updateAccordionPanel_acco']/h3/a")).size()>0)
	       {
			  System.out.println("Navigates to Coverage Code Details Page");
		   }
		else
		   {
			  System.out.println("Failed to navigate to Coverage Code Details Page");
		   }
		   
		driver.findElement(By.xpath("//div[@id='detail-form:updateAccordionPanel_acco']/h3/a")).click();
		WaitForBusy();
		if(driver.findElements(By.xpath("//ul[@id='detailentry_cc_copay']/a")).size()>0)
		  {
		   driver.findElement(By.xpath("//ul[@id='detailentry_cc_copay']/a")).click();
		   WaitForBusy();
 		   System.out.println("Navigates to Copay screen in Coverage Code Details Page");
		  }
		else
		  {
		    System.out.println("Failed to navigate to Copay screen in Coverage Code Details Page");
		  }
	}
	
//************************************Navigates to Copay Screen**********************************************************************************************************	
	
//************************************Benefit Component Copy*************************************************************************************************************
	
 public static void copyBenefitComponent(String strBenefitComponent,String strNewBenefitComponentID,String strNewBenefitComponentName) throws Throwable
	{
		boolean benefitComponentAvailable=false;
		WebElement strPanelContent = driver.findElement(By.xpath("//div[@id='detail-form:entrycontent-panel_content']/div/div[2]"));
		List<WebElement> strTbls = strPanelContent.findElements(By.tagName("table"));
		for(int tbl=0;tbl<=strTbls.size()-1;tbl++)
		{
			WebElement strTblRow = strTbls.get(tbl).findElement(By.tagName("tbody")).findElement(By.tagName("tr"));
			List<WebElement> strTblCols = strTblRow.findElements(By.tagName("td"));
			if(strTblCols.get(0).getText().toLowerCase().contains(strBenefitComponent.toLowerCase()))
			{
				strTblCols.get(1).click();
				WaitForBusy();
				benefitComponentAvailable=true;
				break;
			}
		}
		
		if(benefitComponentAvailable==true)
		 {
            PageNavigation("Benefits");
			FrameNavigation(0);
			ClickOnButton(By.id("detail-form:detail-copy-btn"));
			WaitForBusy();
			WaitUntilWebElementExist(By.id("dialog-form:tracking-id-input"));
			driver.findElement(By.id("dialog-form:tracking-id-input")).sendKeys("Tracking ID1");
			Thread.sleep(1000);
			if(!strNewBenefitComponentID.isEmpty())
			{
				driver.findElement(By.id("dialog-form:componentHead_compid")).sendKeys(strNewBenefitComponentID);
				Thread.sleep(1000);
			}
			if(!strNewBenefitComponentName.isEmpty())
			{
				driver.findElement(By.id("dialog-form:componentHeader_name")).sendKeys(strNewBenefitComponentName);
				Thread.sleep(1000);
			}
	    	Select CopyStatus=new Select(driver.findElement(By.id("dialog-form:componentHeader_statusIndicator")));			
	    	CopyStatus.selectByVisibleText("Ready for Use");
			WaitForBusy();
			ClickOnButton(By.id("dialog-form:btn_copy"));
			WaitForBusy();
			WaitUntilWebElementExist(By.xpath("//div[@id='head-form:msgs_content']/div[2]/div"));
	        if(driver.findElements(By.xpath("//div[@id='head-form:msgs_content']/div[2]/div")).size()>0)
	         {
	        	 System.out.println(strBenefitComponent+" copied successfully");
	         }
	         else
	         {
	        	 System.out.println("Failed to copy "+strBenefitComponent);
	         }
			 driver.close();
			 PageNavigation("Coverage Code");
			 FrameNavigation(0); 
	    }
		else
		{
			System.out.println("The Benefit Component: "+strBenefitComponent+" is not available");
		}
	}
	
//************************************Benefit Component Copy*************************************************************************************************************
	
//************************************Updating Copay Screen**************************************************************************************************************	
	
	
 public static void updateCoverageCodeCopayDetails(String strCA, String strCL, String strCM, String strCV) throws Throwable
	{
		ClickOnButton(By.id("detail-form:details-makeupdate-top"));
		WaitForBusy();
		driver.findElement(By.xpath("(//input[contains(@id,'tracking-id-input')])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@id,'tracking-id-input')])[1]")).sendKeys("Tracking ID1");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit")).click();
		WaitForBusy();
		if(!strCA.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_copayAssignment")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_copayAssignment")).sendKeys(strCA);
			WaitForBusy();
		}
		
		if(!strCL.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_copayLimits")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_copayLimits")).sendKeys(strCL);
			WaitForBusy();
		}
		
		if(!strCM.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_copayMultipliers")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_copayMultipliers")).sendKeys(strCM);
			WaitForBusy();
		}
		
		if(!strCV.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_copayValues")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_copayValues")).sendKeys(strCV);
			WaitForBusy();
		}
		
		ClickOnButton(By.id("detail-form:btnApply"));
		WaitUntilWebElementExist(By.className("searchCountMessage"));
		ClickOnButton(By.id("detail-form:saveDetailButtonTop"));
		WaitForBusy();
		WaitUntilWebElementExist(By.className("searchCountMessage"));
        if(driver.findElements(By.className("searchCountMessage")).size()>0)
        {
       	 System.out.println("Coverage Code Copay screen is updated successfully");
        }
        else
        {
       	 System.out.println("Failed to update Coverage Code Copay screen");
        }
	}
	
//************************************Updating Copay Screen**************************************************************************************************************
	
//************************************Navigates to Coverage Screen*******************************************************************************************************
	
 public static void navigateToCoverageScreen() throws InterruptedException
	{
		if(driver.findElements(By.xpath("//ul[@id='detailentry_cc_coverage']/a")).size()>0)
		  {
		   driver.findElement(By.xpath("//ul[@id='detailentry_cc_coverage']/a")).click();
		   WaitForBusy();
		   System.out.println("Navigates to Coverage screen in Coverage Code Details Page");
		  }
		else
		  {
		    System.out.println("Failed to navigate to Coverage screen in Coverage Code Details Page");
		  }
	}
	
//************************************Navigates to Coverage Screen*******************************************************************************************************
	
//************************************Updating Coverage Screen***********************************************************************************************************	
	
	
 public static void updateCoverageCodeCoverageDetails(String strDL, String strDC, String strRT) throws Throwable
	{
		driver.findElement(By.id("detail-form:details-makeupdate-top")).click();
		WaitForBusy();
		driver.findElement(By.xpath("(//input[contains(@id,'tracking-id-input')])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@id,'tracking-id-input')])[1]")).sendKeys("Tracking ID1");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit")).click();
		WaitForBusy();
		if(!strDL.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_dispensingLimits")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_dispensingLimits")).sendKeys(strDL);
			WaitForBusy();
		}
		
		if(!strDC.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_drugCoverage")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_drugCoverage")).sendKeys(strDC);
			WaitForBusy();
		}
		
		if(!strRT.isEmpty())
		{
			driver.findElement(By.id("detail-form:editablePanel_refillToSoon")).clear();
			Thread.sleep(1000);
			driver.findElement(By.id("detail-form:editablePanel_refillToSoon")).sendKeys(strRT);
			WaitForBusy();
		}
		ClickOnButton(By.id("detail-form:btnApply"));
		WaitUntilWebElementExist(By.className("searchCountMessage"));		
		ClickOnButton(By.id("detail-form:saveDetailButtonTop"));
		WaitUntilWebElementExist(By.className("searchCountMessage"));
        if(driver.findElements(By.className("searchCountMessage")).size()>0)
        {
       	 System.out.println("Coverage Code Coverage screen is updated successfully");
        }
        else
        {
       	 System.out.println("Failed to update Coverage Code Coverage screen");
        }
	}
	
//************************************Updating Coverage Screen***********************************************************************************************************	

//************************************Common Functions*******************************************************************************************************************

	
 public static void login(String UName, String Pswd, String region)
	  {
		
		driver.findElement(By.xpath(".//*[@id='loginForm:principal']")).sendKeys(UName);
		driver.findElement(By.xpath(".//*[@id='loginForm:credentials']")).sendKeys(Pswd);
		
		//click on submit button
		driver.findElement(By.xpath(".//*[@id='loginForm:loginButton']")).click();
		
		//Click on Region
		driver.findElement(By.linkText(region)).click();
		
	} // Login to Application and select Region
	
	
 public static void SelectApplicationFromMenu(String menuItems)
	{

		String[] menuItem= menuItems.split(";");
            for (int strMenuItems=0;strMenuItems<menuItem.length;strMenuItems++ )
            {
                   
				  List<WebElement> totalMenuItems=driver.findElements(By.tagName("li"));
                for (int strMenuItem=0;strMenuItem<totalMenuItems.size();strMenuItem++)
                {
                   
                   if (totalMenuItems.get(strMenuItem).getText().equals(menuItem[strMenuItems]))
                   {
                          totalMenuItems.get(strMenuItem).click();
                          break;               
                   }
                }
                   
            }
	}
	
 public static void WaitForBusy() throws InterruptedException
     {
		try
			{
			WebDriverWait wt= new WebDriverWait(driver,60);
			WebElement busyElement=driver.findElement(By.id("loading"));
			
			if(busyElement.getAttribute("style").equals(null)|| busyElement.getAttribute("style").isEmpty() || busyElement.getAttribute("style").equals(""))
			{
				return;
			}
			else
			{
 			   wt.until(ExpectedConditions.attributeToBe(busyElement,"style","display: none;"));
			}			
				//System.out.println("Performed Wait");
			}
			catch(Exception e)
			{
				Thread.sleep(5000);
			}
		}
 
 public static void PageNavigation(String strApp) throws InterruptedException
	 {
	 
	 for (String Child_Window : driver.getWindowHandles())
		 {
		      driver.switchTo().window(Child_Window);

			   if(driver.switchTo().window(Child_Window).getTitle().contains(strApp))
			   {
				   //System.out.println("Page is Loaded");
				   driver.manage().window().maximize();
			   }
		 }

      }

  public static void FrameNavigation(int strFrameIndex)
	 {
	   driver.switchTo().frame(strFrameIndex);
	 }
  
	public static void ClickOnButton(By objElementName) throws Throwable
	{
		int attempts=0;
		while(attempts < 3 && driver.findElements(objElementName).size()!=0)
		{
			try
			{
				WaitUntilWebElementExist(objElementName);
				if(driver.findElements(objElementName).size()!=0)
				{
					String strName = driver.findElement(objElementName).getAttribute("name");
					driver.findElement(objElementName).click();
					Thread.sleep(3000);
					System.out.println("Clicked on webelement : " + strName);
				}
				break;
			}catch(StaleElementReferenceException e){				
			}
			attempts++;
			System.out.println(attempts);
		}
	}
	
	public static void WaitUntilWebElementExist(By strItem) throws Throwable
	{	
		WebDriverWait wb=new WebDriverWait(driver,60);
		wb.until(ExpectedConditions.presenceOfElementLocated(strItem));
	}
	
	 
	 
	//************************************Common Functions*******************************************************************************************************************

}
