package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Features"},
glue = {"StepDefinitions","Hooks"},
plugin = {"pretty","json:target/cucumber-json-report/cucumber.json", "html:target/cucumber-report.html"},
tags = "@TP_Textbox or @rahulShettyPractise")
public class CucumberTests extends AbstractTestNGCucumberTests {
// or @rahulShettyPractise
}
