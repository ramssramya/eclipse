package StepDefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logincart{
WebDriver driver;


   @Given("Launch the URL")
   public void launch_the_url() {
	  WebDriverManager.edgedriver().setup();
      driver=new EdgeDriver();
      driver.get("https://demo.opencart.com/");
      driver.manage().window().maximize();
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


   @And("click on desktop ")
   public void click_on_desktop() {
	   driver.findElement(By.linkText("Desktops")).click();
   }
   @And("click on mac")
   public void click_on_mac() {
	   driver.findElement(By.linkText("Mac (1)")).click();
		WebElement heading=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
		System.out.println(heading.getText());
   }
   @And("click on Name(A-Z) in sort By dropdown")
   public void click_on_sortby_in_dropdown(){
	   Select sortlist=new Select(driver.findElement(By.id("input-sort")));
       sortlist.selectByIndex(1);
   }
   @When("click on add to cart button")
   public void click_on_addtocart_button() {
	   driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
	   
   }

   @Then("item should be added successfull")
   public void item_should_be_added_successfull() {
     System.out.println("item added successfull");
   }
}