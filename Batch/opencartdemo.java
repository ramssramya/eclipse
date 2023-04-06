package Batch;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencartdemo {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//String expectedtitle="Your Store";
		//String actualtitle=driver.getTitle();
		//System.out.println("open cart title:"+actualtitle);
		//Assert.assertTrue(actualtitle.equalsIgnoreCase(expectedtitle) );
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		WebElement heading=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		System.out.println(heading.getText());
		Select sortlist=new Select(driver.findElement(By.id("input-sort")));
	    sortlist.selectByIndex(1);
	    driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
	    System.out.println("item added to cart successfully");
	}
	

}
