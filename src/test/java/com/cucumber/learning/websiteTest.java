package com.cucumber.learning;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.automation.commonFuntion;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class websiteTest {

	private commonFuntion automation=new commonFuntion();
	private WebDriver driver;
	
	@Given("^I go to ([^\"]*) of gmail$")
	public void gotoUrl(String url) throws InterruptedException{
	   driver=automation.openBrowser("chrome");
	   Thread.sleep(5000);
	   driver.get(url);
	}

	@When("^I click on the link$")
	public void clickLink() throws InterruptedException{
	  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='post-143']/div/p/strong[1]/span/a/")).click();
	}
	

	@Then("^it should show me the page$")
	public void verifyPage() throws InterruptedException{
		Thread.sleep(7000);
		Assert.assertTrue("Image is not present", driver.findElement(By.xpath("//*[@id='post-49']/div/p[2]/a/img"))!=null);
		driver.quit();
	}
	
	

}
