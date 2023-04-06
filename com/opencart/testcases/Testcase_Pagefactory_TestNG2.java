package com.opencart.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencart.pageobjects.pagefactory3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_Pagefactory_TestNG2{
	
@Test
	public void Testcase2() throws IOException {
		// TODO Auto-generated method stub
	//String propertypath="C:\\Users\\Administrator\\Documents\\eclipse\\March\\src\\test\\java\\com\\opencart\\testdata\\input properties";
    //propertypath=propertypath.trim();  
    //InputStream input=new FileInputStream(propertypath);
    //Properties prob=new Properties();
    //prob.load(input);
    //String url=prob.getProperty("url");
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\Documents\\eclipse\\March\\Reports");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Login to OpenCart");
	
    
	
	File f1=new File("C:\\Users\\Administrator\\Documents\\eclipse\\March\\src\\test\\java\\com\\opencart\\testdata\\Data.xlsx");
	
	FileInputStream fis=new FileInputStream(f1);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=0;i<rowcount;i++)
	{
		  
     String username=sheet.getRow(i).getCell(0).getStringCellValue();
     String password=sheet.getRow(i).getCell(1).getStringCellValue();

		 WebDriverManager.edgedriver().setup();
		 
	     WebDriver driver=new EdgeDriver();
	    
	     pagefactory3 obj=PageFactory.initElements(driver,pagefactory3.class);
	     
	     driver.get("https://demo.opencart.com/");
	     
	     obj.clickonmyaccount();
	     if(driver.findElement(By.linkText("Login")).isDisplayed()) {
	    	 test.pass("My Account is clicked");
	     }
	     else {
	    	 test.fail("My Account is not clicked");
	     }
	     obj.clickonloginlink();
	     obj.enteremail(username);
	     obj.enterpassword(password);
	     obj.clickonsubmit();
	     driver.quit();
	}  
	 extent.flush();    	

 }
}

