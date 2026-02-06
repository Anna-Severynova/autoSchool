package seleniumJava;

import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    //Constructor
    public CheckoutPage(WebDriver driver1) {
        this.driver = driver1;
    }


    //14
    public void fillAndSendCheckoutInfo(){
        Locators locators = new Locators(driver);
        locators.sendInfoByID("first-name", "Anna");
        locators.sendInfoByID("last-name", "Severynova");
        locators.sendInfoByID("postal-code", "12345");
    }

    public void clickContinueCheckoutButton(){
        Locators locators = new Locators(driver);
        locators.clickButtonByID("continue");
    }
}
