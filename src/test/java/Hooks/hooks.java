package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    public static WebDriver driver;
    public static String url = "https://rahulshettyacademy.com";

    @Before
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void teardown(){
        driver.quit();
    }

}
