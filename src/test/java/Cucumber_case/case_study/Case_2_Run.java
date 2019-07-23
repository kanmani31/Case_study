package Cucumber_case.case_study;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	 @CucumberOptions(features="C:\\Users\\training_c2a.05.01\\Desktop\\Padma\\case_study\\src\\resources\\java\\Case_2.feature",
	 plugin= {"html:target\\Report_2"})
	public class Case_2_Run {
	 
	public class Login_Runner {
	}
}
