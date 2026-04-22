package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    WebDriver driver;

    //Constructor
    public Locators(WebDriver driver) {
        this.driver = driver;
    }


    public void clickButtonByID(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public void sendInfoByID(String locator, String keys){
        driver.findElement(By.id(locator)).sendKeys(keys);
    }
}