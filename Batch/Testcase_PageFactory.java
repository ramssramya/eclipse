package Batch;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_PageFactory {
	public static void main(String[] args) {

		  WebDriverManager.edgedriver().setup();
	        WebDriver driver=new EdgeDriver();
	        pagefactory1 obj=PageFactory.initElements( driver,pagefactory1.class);
	      
	        driver.get("https://demo.opencart.com/");
	        obj.clickonmyaccount();
	        obj.clickonloginlink();
	        obj.enteremail("Ramya@gmail.com");
	        obj.enterpassword("welcome");
	        obj.clickonloginlink();
	       
	        /*driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Login")).click();
	        driver.findElement(By.id("input-email")).sendKeys("Welcome@gmail.com");
	        driver.findElement(By.id("input-password")).sendKeys("welcome");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
            */
	}

} 
