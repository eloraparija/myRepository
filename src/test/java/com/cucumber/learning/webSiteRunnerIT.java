package com.cucumber.learning;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.automation.commonFuntion;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty","html:output"},
features={"src/test/resources/com/cucumber/learning/Test.feature"},
glue={"com.cucumber.learning"})
public class webSiteRunnerIT {

	/*private static WebDriver driver;
	private static commonFuntion automation=null;
	@AfterClass
	public static void closeBrowser(){
		automation= commonFuntion.getInstance();
		driver = automation.openBrowser("Mozilla");
		driver.quit();
	}*/
}
