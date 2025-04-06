package StepDefinitions;

import Pages.TutorialsPointPractisePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialsPointPractiseStepDefinitions {

    TutorialsPointPractisePage tpp = new TutorialsPointPractisePage();

    @Given("user launches the tutorials point practise page {string}")
    public void launchTutorialsPointPage(String url){
        tpp.launchTutorialsPointPage(url);
    }

    @When("user enters full name as {string}")
    public void enterFullName(String fullName){
        tpp.enterFullName(fullName);
    }

    @And("user enters email address as {string}")
    public void enterEmailAddress(String emailAddress){
        tpp.enterEmailAddress(emailAddress);
    }

    @And("user enters address as {string}")
    public void enterCurrentAddress(String address){
        tpp.enterCurrentAddress(address);
    }

    @Then("user enters password as {string}")
    public void enterPassword(String pwd){
        tpp.enterPassword(pwd);
    }
}
