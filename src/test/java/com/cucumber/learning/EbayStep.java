package com.cucumber.learning;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;





import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.automation.commonFuntion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EbayStep {

	private commonFuntion automation=new commonFuntion();
	WebDriverWait wait = null;
	List<WebElement> items =new ArrayList<WebElement>();
	private WebDriver driver;
	@Given("^I go to ebay website$")
	public void i_go_to_ebay() throws Throwable {
	 
		driver=automation.openBrowser("chrome");
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
	}

	@When("^I search for all links$")
	public void i_search_for_all_links() throws Throwable {
	    WebElement menu = driver.findElement(By.id("navigationFragment"));
	    items = menu.findElements(By.tagName("a"));
	  
	}

	@Then("^I should see the below links$")
	public void i_should_see_the_below_links(List<String> menuItem) throws Throwable {
		  for(int i=0;i<3;i++){
		    	System.out.println(items.get(i).getText());
		    		Assert.assertTrue("item doesnt match", items.get(i).getText().equals(menuItem.get(i)));
		    }
	}
}
