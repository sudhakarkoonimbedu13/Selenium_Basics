package DataDriverTesting_JUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utils 
{
  public static FileInputStream fis;
  public static XSSFWorkbook wb;
  public static XSSFSheet ws;
  
  public static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
  
  public static void setDriver()
   {	   
	   FirefoxBinary bin = new FirefoxBinary(new File("C:\\Users\\dt204684\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
	   WebDriver driver = new FirefoxDriver(bin,null);
	   td.set(driver);
   }
  
  public static WebDriver getDriver()
   {
	  return td.get();
   }
	
  public boolean isSkipTest(String strTestCase) throws IOException
   {
	   fis = new FileInputStream(System.getProperty("user.dir")+"//TestData//DataDrivenTesting.xlsx");
	   wb = new XSSFWorkbook(fis);
	   ws = wb.getSheet("TestCase");
	   
	   int rowCount = ws.getLastRowNum()+1;	   
	   
	   for(int i=1;i<rowCount;i++)
	   {
		   Row r = ws.getRow(i);
		   int colCount = r.getLastCellNum();
		   for(int j=0;j<colCount;j++)
		   {
			   Cell c = r.getCell(j);
			   
			   if(c.getStringCellValue().equalsIgnoreCase(strTestCase))
			   {
				   String strRunMode = r.getCell(j+2).getStringCellValue();
				   if(strRunMode.equals("N"))
				   {
                      return true;
				   }
				   else
				   {
                      return false;
				   }
			   }

		   }

	   }
	   
       return false;
	   
   }
  
  
  // One way of retrieving data from Excel File
  
  public static Object[][] getData1(String strSheetName) throws IOException
  {
	   fis = new FileInputStream(System.getProperty("user.dir")+"//TestData//DataDrivenTesting.xlsx");
	   wb = new XSSFWorkbook(fis);
	   ws = wb.getSheet(strSheetName);
	   
	   Object[][] data=null;
   
	   int rowCount = ws.getLastRowNum();
	   if(rowCount<=0)
	   {
		   Object[][] testData = new Object[1][0];
		   return testData;
	   }
	   
	   rowCount = ws.getLastRowNum();
       int CellCount = ws.getRow(0).getLastCellNum();
       data = new Object[rowCount][CellCount];
	   
	   for(int i=1;i<=rowCount;i++)
	   {
		   Row r = ws.getRow(i);
		   int colCount = r.getLastCellNum();
		   for(int j=0;j<colCount;j++)
		   {
			   Cell c = r.getCell(j);
			   
			   data[i-1][j] = c.getStringCellValue();
			   System.out.println(i-1+"...."+j+":"+data[i-1][j]);
		   }
	   }
	   return data;		   
	   
  }
  
  // Second way of retrieving data
  
  public Object[][] getData(String strFileName) throws IOException
  {
	   
	  Xls_Reader xls = new Xls_Reader(strFileName);
	  
	  int rowCount = xls.getRowCount("LoginTest")-1;	 
 
	  if(rowCount<=0)
	   {
		   Object[][] testData = new Object[1][0];
		   return testData;
	   }
	  
	  rowCount = xls.getRowCount("LoginTest");
	  int cellCount = xls.getCellCount("LoginTest");
	  Object[][] data = new Object[rowCount-1][cellCount];
	   
	   for(int i=1;i<rowCount;i++)
	   {
		   for(int j=0;j<cellCount-1;j++)
		   {
			   String cellData = xls.getCellData("LoginTest", i, j);			   
			   
			   data[i-1][j] = cellData;
			   System.out.println(i-1+"...."+j+":"+data[i-1][j]);
		   }
	   }
	   return data;		   
	   
}  
  
  
  public static void screenshot(WebDriver driver,String strFileName)
  {
	  try
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\"+strFileName+".png"));
	  }
	  catch(Exception e){}
  }
  
}
