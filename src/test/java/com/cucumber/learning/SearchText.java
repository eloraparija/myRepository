package com.cucumber.learning;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.automation.commonFuntion;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchText {


	private commonFuntion automation=new commonFuntion();
	private WebDriver driver;
	
	@Given("^I go to google$")
	public void I_go_to_google_to_search_text() {
		driver=automation.openBrowser("chrome");
		driver.get("http://google.com");
		
		
	}
	
	@When("^I search \\~([^\"]*)\\~$")
	public void I_search_selenium(String searchText) {
		
		driver.findElement(By.name("q")).sendKeys(searchText);
	}
	@Then("^it should show me the result$")
	public void it_should_show_me_the_result() throws InterruptedException{
		Thread.sleep(7000);
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.xpath("//div[@class='rc']/h3/a")).click();
		driver.quit();
	}
	


}
