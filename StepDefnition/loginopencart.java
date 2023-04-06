package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginopencart{
WebDriver driver;


   @Given("Launch the URL")
   public void launch_the_url() {
	  WebDriverManager.edgedriver().setup();
      driver=new EdgeDriver();
      driver.get("https://demo.opencart.com/");
   }

   @And("Navigate to the login page")
   public void navigate_to_the_login_page() {
	  driver.findElement(By.linkText("My Account")).click();
      driver.findElement(By.linkText("Login")).click();
   }

   @And("enter the username and password")
   public void enter_the_username_and_password() {
	 driver.findElement(By.id("input-email")).sendKeys("Welcome@gmail.com");
     driver.findElement(By.id("input-password")).sendKeys("welcome");
   }

   @When("click on login button") 
   public void click_on_login_button() {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
   }

   @Then("login should be successfull")
   public void login_should_be_successfull() {
     System.out.println("login unsuccessfull");
   }
}