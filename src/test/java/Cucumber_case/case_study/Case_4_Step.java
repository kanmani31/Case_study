package Cucumber_case.case_study;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_4_Step {
  WebDriver driver;
  @Given("^The user is in Login page of TestMe app$")
  public void the_user_is_in_Login_page_of_TestMe_app() throws Throwable {
	  driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
  }

  @When("^The user enters \"([^\"]*)\" and \"([^\"]*)\" in the username and password fields$")
  public void the_user_enters_and_in_the_username_and_password_fields(String arg1, String arg2) throws Throwable {
	  driver.findElement(By.name("userName")).sendKeys(arg1);
	    driver.findElement(By.id("password")).sendKeys(arg2);
	    driver.findElement(By.name("Login")).click();
  }

  @Then("^The user should be logged in and directed to home page$")
  public void the_user_should_be_logged_in_and_directed_to_home_page() throws Throwable {
	  Assert.assertTrue(driver.getTitle().contains("Home"));
  }

 

  @When("^The user searches for the headphones$")
  public void the_user_searches_for_the_headphones() throws Throwable {
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
	  Actions act=new Actions(driver);
     driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
     //act.sendKeys(Keys.DOWN).click().build().perform();
     driver.findElement(By.name("val")).click();
     
     
     
  }

  

  @Then("^The user doesn't add the product to cart$")
  public void the_user_doesn_t_add_the_product_to_cart() throws Throwable {
	  driver.findElement(By.partialLinkText("Add to cart")).click();
	  Assert.assertNotNull(driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")));
	 
	  
	  
  }
  @Given("^The user is in the home page$")
  public void the_user_is_in_the_home_page() throws Throwable {
      
  }
}
