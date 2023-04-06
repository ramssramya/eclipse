package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class demo6 {

	

	public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com");
        driver.findElements(By.xpath("//button[@class='navbar-toggler']"));
        driver.findElement(By.linkText("Components")).click();
        driver.findElements(By.xpath("//button[@class='form-select']"));
        Select sortlist=new Select(driver.findElement(By.id("input-sort")));
        sortlist.selectByIndex(2);
        Select sortlist1=new Select(driver.findElement(By.id("input-sort")));
        sortlist1.selectByIndex(2);
        System.out.println("d");
	}

}
