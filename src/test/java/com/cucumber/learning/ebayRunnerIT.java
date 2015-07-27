package com.cucumber.learning;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format="html:output",features="src\\test\\resources\\com\\cucumber\\learning\\ebay.feature")
public class ebayRunnerIT {

}
