package Cucumber_case.case_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_1 {
	WebDriver driver;
	@Given("^The User should be in home page$")
	public void the_User_should_be_in_home_page() throws Throwable {
	    driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@Given("^Click on the Signup link$")
	public void click_on_the_Signup_link() throws Throwable {
		driver.findElement(By.partialLinkText("SignUp")).click();
	}
	@When("^The User enters the username as \"([^\"]*)\" and firstname as \"([^\"]*)\" and lastname as \"([^\"]*)\" and password as \"([^\"]*)\" and confirm password as \"([^\"]*)\"$")
	public void the_User_enters_the_username_as_and_firstname_as_and_lastname_as_and_password_as_and_confirm_password_as(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("arg1");
		driver.findElement(By.name("firstName")).sendKeys("arg2");
		driver.findElement(By.name("lastName")).sendKeys("arg3");
		driver.findElement(By.name("password")).sendKeys("arg4");
		driver.findElement(By.name("confirmPassword")).sendKeys("arg5");
		
		}
		
	

	@When("^select gender options and enter email as \"([^\"]*)\" and number as \"([^\"]*)\" and Dob as\"([^\"]*)\" and address as \"([^\"]*)\"$")
	public void select_gender_options_and_enter_email_as_and_number_as_and_Dob_as_and_address_as(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("arg1");
		driver.findElement(By.id("mobileNumber")).sendKeys("arg2");
		driver.findElement(By.name("dob")).sendKeys("arg3");
		driver.findElement(By.name("address")).sendKeys("arg4");
		
		
	}

	@When("^selects a security question and enter answer as \"([^\"]*)\" and click register button$")
	public void selects_a_security_question_and_enter_answer_as_and_click_register_button(String arg1) throws Throwable {
		Select var=new Select(driver.findElement(By.id("securityQuestion")));
		var.selectByIndex(1);
		driver.findElement(By.name("answer")).sendKeys("arg1");
		driver.findElement(By.name("Submit")).click();
	}
	

	@Then("^The user must be directed to login page$")
	public void the_user_must_be_directed_to_login_page() throws Throwable {
	    if(driver.getTitle().contains("Login")) {
	    	System.out.println("The Registration is Succesful");
	    }
	    else
	    {
	    	System.out.println("Registration not successful");
	    }
	}
}
