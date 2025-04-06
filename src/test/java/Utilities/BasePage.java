package Utilities;

import Hooks.hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage {

    public WebDriver driver;
    public BasePage(){
        this.driver = hooks.driver;
    }

    public void setSleepTimeInSeconds(long seconds) {
        long milliseconds = seconds * 1000;
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyBooleanEquals(boolean expected, boolean actual, String message){
        Assert.assertEquals(expected, actual, message);
    }

    public boolean isElementVisible(WebElement element){
        return element.isDisplayed();
    }

    public boolean isElementSelected(WebElement element){
        return element.isSelected();
    }

    public void enterTextIntoTextField(WebElement element, String textToEnter){
        element.sendKeys(textToEnter);
    }

    public void clickOnWebElement(WebElement element){
        element.click();
    }
}
