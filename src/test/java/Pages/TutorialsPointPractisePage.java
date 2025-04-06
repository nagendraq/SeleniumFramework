package Pages;

import Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsPointPractisePage extends BasePage {

    @FindBy(xpath = "//input[@id='fullname']")
    public static WebElement fullName;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;

    @FindBy(xpath = "//textarea[@id='address']")
    public static WebElement address;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;

    public TutorialsPointPractisePage(){
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String name){
        enterTextIntoTextField(fullName, name);
    }

    public void enterEmailAddress(String emailAddress){
        enterTextIntoTextField(email, emailAddress);
    }

    public void enterCurrentAddress(String currentAddress){
        enterTextIntoTextField(address, currentAddress);
    }

    public void launchTutorialsPointPage(String url) {
        driver.get(url);
    }

    public void enterPassword(String pwd) {
        enterTextIntoTextField(password, pwd);
        setSleepTimeInSeconds(3);
    }
}
