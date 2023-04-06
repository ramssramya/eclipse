package Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pageobjects {
		 WebDriver driver;
	       By myaccountlink= By.linkText("My Account");
	       By loginlink= By.linkText("Login");
	       By email=By.id("input-email");
	       By password=By.id("input-password");
	       By loginbutton= By.xpath("//button[@type='submit']");
public pageobjects(WebDriver driver) {
	this.driver=driver;
}
public void clickonmyaccount() {
	driver.findElement(myaccountlink).click();
}
public void clickonloginlink() {
	driver.findElement(loginlink).click();
}
public void enteremail() {
	driver.findElement(email).sendKeys("Ramya@gmil.com");
}
public void enterpassword() {
	driver.findElement(password).sendKeys("welcome");
}
public void clickonsubmit() {
	driver.findElement(loginbutton).click();
}

	}


