package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
    WebDriver driver;

    //Constructor
    public FinishPage(WebDriver driver1) {
        this.driver = driver1;
    }

    //Locators
    By productCount = By.className("cart_quantity");

    public String getCountItem() {
        return driver.findElement(productCount).getText();
    }

    public void clickFinishButton(){
        Locators locator = new Locators(driver);
        locator.clickButtonByID("finish");
    }
}
