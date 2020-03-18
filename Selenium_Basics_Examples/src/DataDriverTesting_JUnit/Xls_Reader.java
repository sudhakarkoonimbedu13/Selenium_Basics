package DataDriverTesting_JUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader 
{
	private String strFilePath;
	private static FileInputStream fis;
	private static XSSFWorkbook wb;
	private static XSSFSheet ws;
	
    public Xls_Reader(String strFilePath) throws IOException
    {
    	this.strFilePath = strFilePath;
    	init(strFilePath);
    }
    
    public static void init(String strFilePath) throws IOException
    {
    	fis = new FileInputStream(strFilePath);
    	wb = new XSSFWorkbook(fis);
    }
    
    public int getRowCount(String strSheetName)
    {
    	int rowCount=0;
    	
    	ws = wb.getSheet(strSheetName);
    	try
    	 {
        	rowCount = ws.getLastRowNum()+1;        		
    	 }
    	catch(Throwable e)
    	 {
    		System.out.println("No Rows are present in the specified sheet");
    	 }
    	
		return rowCount;
    }
    
    public int getCellCount(String strSheetName)
    {
    	int cellCount =0;
    	
    	ws = wb.getSheet(strSheetName);
    	cellCount = ws.getRow(0).getLastCellNum();
		return cellCount;
    }
    
    public String getCellData(String strSheetName,String columnName,int rowNumber)
    {
    	String cellData = null;
    	
    	ws = wb.getSheet(strSheetName);
    	
    	int cellCount = ws.getRow(0).getLastCellNum();
    	
    	for(int i=0;i<cellCount;i++)
    	{
    		XSSFCell c = ws.getRow(0).getCell(i);
    		if(c.getStringCellValue()!=null && c.getStringCellValue().equals(columnName))
    		{
    			cellData = ws.getRow(rowNumber).getCell(i).getStringCellValue();
    			break;
    		}
    	}
    	
    	return cellData;
    	
    }
    
    public String getCellData(String strSheetName,int rowNumber,int cellNumber)
    {    	
    	String cellData = null;
    	
    	ws = wb.getSheet(strSheetName);
    	
    	cellData= ws.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
    	
    	return cellData;
    }  
    
    

}
