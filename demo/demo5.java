package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class demo5{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello world");
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("Welcome@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("welcome");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("ramya");
        driver.findElement(By.id("input-lastname")).sendKeys("ramya");
        driver.findElement(By.id("input-email")).sendKeys("ramya@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='continue']")).click();
       
        
        System.out.println("The tittle of the browser is:"+driver.getTitle());
	}
}
        