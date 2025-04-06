package StepDefinitions;

import Pages.RahulShettyPractisePage;
import Utilities.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RahulShettyPractiseStepDefinitions {

    RahulShettyPractisePage rsp = new RahulShettyPractisePage();

    @Given("user launches the rahul shetty practise page {string}")
    public void launchApplication(String url){
        rsp.launchApplicationWithExtendedUrl(url);
    }

    @When("user clicks on first radio button")
    public void selectFirstRadioButton(){
        rsp.selectFirstRadioButton();
    }

    @Then("application should show first radio button as selected")
    public void verifyFirstRadioButtonStatus(){
        rsp.verifyFirstRadioButtonStatus();
    }

    @When("user clicks on second radio button")
    public void selectSecondRadioButton(){
        rsp.selectSecondRadioButton();
    }

    @Then("application should show second radio button as selected")
    public void verifySecondRadioButtonStatus(){
        rsp.verifySecondRadioButtonStatus();
    }

    @And("application should show third radio button as unselected")
    public void verifyThirdRadioButtonStatus(){
        rsp.verifyThirdRadioButtonStatus();
    }

    @When("user clicks on first checkbox")
    public void selectFirstCheckbox(){
        rsp.selectFirstCheckbox();
    }

    @Then("application should show first checkbox as selected")
    public void verifyFirstCheckboxStatus(){
        rsp.verifyFirstCheckboxStatus();
    }

    @When("user clicks on second checkbox")
    public void selectSecondCheckbox(){
        rsp.selectSecondCheckbox();
    }

    @Then("application should show second checkbox as selected")
    public void verifySecondCheckboxStatus(){
        rsp.verifySecondCheckboxStatus();
    }

    @And("application should show third checkbox as unselected")
    public void verifyThirdCheckboxStatus(){
        rsp.verifyThirdCheckboxStatus();
    }

    @When("user enters country name {string} in auto complete country field")
    public void enterCountryName(String countryName){
        rsp.enterCountryName(countryName);
    }

    @Then("application should display the suggestions in auto complete country field")
    public void verifyCountrySuggestionsVisibility(){
        rsp.verifyCountrySuggestionsVisibility();
    }

//    @And("user should be able to select the {string} country from suggestions")
//    public void selectCountryFromSuggestions(String countryName){
//        rsp.selectCountryFromSuggestions(countryName);
//    }

    @And("user should be able to select the \"Indonesia\" country from suggestions")
    public void selectIndonesiaCountryFromSuggestions(){
        rsp.selectIndonesiaCountryFromSuggestions();
    }
}
