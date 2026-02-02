package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    public LoginPage(WebDriver driver1) {
        this.driver = driver1;
    }

    //Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessageButton = By.className("error-button");

    //Methods to interact with the elements
    public void enterUserName(String strUserName) {
        driver.findElement(username).sendKeys(strUserName);
    }

    public void enterPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void closeErrorMessage() {
        driver.findElement(errorMessageButton).click();
    }
}