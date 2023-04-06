package Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomfile {

	public static void main(String[] args) {
		  WebDriverManager.edgedriver().setup();
	        WebDriver driver=new EdgeDriver();
	        pageobjects obj=new pageobjects(driver);
	        driver.get("https://demo.opencart.com/");
	        obj.clickonmyaccount();
	        obj.clickonloginlink();
	        obj.enteremail();
	        obj.enterpassword();
	        obj.clickonloginlink();
	       
	        /*driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Login")).click();
	        driver.findElement(By.id("input-email")).sendKeys("Welcome@gmail.com");
	        driver.findElement(By.id("input-password")).sendKeys("welcome");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
            */
     }

}
