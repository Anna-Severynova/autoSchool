package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
    WebDriver driver;

    //Constructor
    public Locators(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCardByID(String locator){
        driver.findElement(By.id(locator)).click();
    }

}
