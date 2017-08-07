package ctli.it.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resource/"},tags={"@tag"},plugin={"html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})

public class RunnerClass {
}


