package Pages;

import Hooks.hooks;
import Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyPractisePage extends BasePage {

    @FindBy(xpath = "//input[@value='radio1']")
    public static WebElement firstRadioButton;

    @FindBy(xpath = "//input[@value='radio2']")
    public static WebElement secondRadioButton;

    @FindBy(xpath = "//input[@value='radio3']")
    public static WebElement thirdRadioButton;

    @FindBy(xpath = "//input[@id='autocomplete']")
    public static WebElement countryAutoCompleteField;

    @FindBy(xpath = "//ul[contains(@class,'ui-autocomplete')]")
    public static WebElement autoCompleteSuggestions;

    @FindBy(xpath = "//li/div[@class='ui-menu-item-wrapper'][text()='India']")
    public static WebElement indiaCountryMenuItem;

    @FindBy(xpath = "//li/div[@class='ui-menu-item-wrapper'][text()='Indonesia']")
    public static WebElement indonesiaCountryMenuItem;

    @FindBy(xpath = "//input[@id='checkBoxOption1']")
    public static WebElement firstCheckbox;

    @FindBy(xpath = "//input[@id='checkBoxOption2']")
    public static WebElement secondCheckbox;

    @FindBy(xpath = "//input[@id='checkBoxOption3']")
    public static WebElement thirdCheckbox;

    public RahulShettyPractisePage(){
        PageFactory.initElements(driver, this);
    }

    public void launchApplicationWithExtendedUrl(String url){
        driver.get(url);
    }

    /**
     * This method is used to select first radio button
     */
    public void selectFirstRadioButton(){
        clickOnWebElement(firstRadioButton);
    }

    /**
     * This method is used to verify first selected radio button
     */
    public void verifyFirstRadioButtonStatus(){
        boolean isFirstRadioButtonSelected = isElementSelected(firstRadioButton);
        verifyBooleanEquals(true, isFirstRadioButtonSelected, "Radio button is selected");
    }

    public void selectSecondRadioButton() {
        clickOnWebElement(secondRadioButton);
    }

    public void verifySecondRadioButtonStatus() {
        boolean isSecondRadioButtonSelected = isElementSelected(secondRadioButton);
        verifyBooleanEquals(true, isSecondRadioButtonSelected, "Radio button is selected");
    }

    public void verifyThirdRadioButtonStatus(){
        boolean isThirdRadioButtonSelected = isElementSelected(thirdRadioButton);
        verifyBooleanEquals(false, isThirdRadioButtonSelected, "Radio button is selected");
    }

    public void selectFirstCheckbox(){
        clickOnWebElement(firstCheckbox);
    }

    public void verifyFirstCheckboxStatus(){
        boolean isFirstCheckboxSelected = isElementSelected(firstCheckbox);
        verifyBooleanEquals(true, isFirstCheckboxSelected, "Checkbox is not selected");
    }

    public void selectSecondCheckbox(){
        clickOnWebElement(secondCheckbox);
    }

    public void verifySecondCheckboxStatus(){
        boolean isSecondCheckboxSelected = isElementSelected(secondCheckbox);
        verifyBooleanEquals(true, isSecondCheckboxSelected, "Checkbox is not selected");
    }

    public void verifyThirdCheckboxStatus(){
        boolean isThirdCheckboxSelected = isElementSelected(thirdCheckbox);
        verifyBooleanEquals(false, isThirdCheckboxSelected, "Checkbox is selected");
    }

    public void enterCountryName(String countryName) {
        enterTextIntoTextField(countryAutoCompleteField, countryName);
    }

    public void verifyCountrySuggestionsVisibility() {
        setSleepTimeInSeconds(3);
        boolean isAutoCompleteSuggestionsVisible = isElementVisible(autoCompleteSuggestions);
        verifyBooleanEquals(true, isAutoCompleteSuggestionsVisible, "Auto complete suggestions are not displaying");
    }

    public void selectCountryFromSuggestions(String countryName) {
        clickOnWebElement(indiaCountryMenuItem);
        setSleepTimeInSeconds(3);
    }

    public void selectIndonesiaCountryFromSuggestions() {
        clickOnWebElement(indonesiaCountryMenuItem);
        setSleepTimeInSeconds(3);
    }
}
