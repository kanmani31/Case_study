package Cucumber_case.case_study;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	 @CucumberOptions(features="C:\\Users\\training_c2a.05.01\\Desktop\\Padma\\case_study\\src\\resources\\java\\Case_4.feature",
	 plugin= {"html:target\\Report_4"})
	public class Case_4_Run {
	 
	public class Login_Runner {
	}
}
