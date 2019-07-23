package Cucumber_case.case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_2_Step {
	WebDriver driver;
	@Given("^The user is already registered and in the login page$")
	public void the_user_is_already_registered_and_in_the_login_page() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^The user enters lalitha and password(\\d+) and click on login button$")
	public void the_user_enters_lalitha_and_password_and_click_on_login_button(int arg1) throws Throwable {
	    
	}

	@Then("^The user must be directed to home page$")
	public void the_user_must_be_directed_to_home_page() throws Throwable {
	    if(driver.getTitle().contains("Home"))
	    {
	    	System.out.println("Login Successful");
	    }
	    else {
	    	System.out.println("Login not successful");
	    }
	}

	
		 

@When("^The user enters \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
public void the_user_enters_and_and_click_on_login_button(String arg1, String arg2) throws Throwable {
	driver.findElement(By.name("userName")).sendKeys(arg1);
    driver.findElement(By.id("password")).sendKeys(arg2);
    driver.findElement(By.name("Login")).click();
}
}

