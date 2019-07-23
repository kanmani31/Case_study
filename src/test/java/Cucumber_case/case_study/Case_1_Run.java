package Cucumber_case.case_study;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Case_1_Run {
	@RunWith(Cucumber.class)
	 @CucumberOptions(features="/case_study/src/resources/java/Case_1.feature")
	 
	public class Login_Runner {
	}
}
