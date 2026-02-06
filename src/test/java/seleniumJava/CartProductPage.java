package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartProductPage {
    WebDriver driver;

    //Constructor
    public CartProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By productName = By.id("item_0_title_link");
    By productDesc = By.className("inventory_item_desc");
    By productCount = By.className("cart_quantity");
    By productPrice = By.className("inventory_item_price");
    By removeButton = By.className("btn");
    By continueShoppingButton = By.id("continue-shopping");

    //8,9
    public String getNameItem() {
        return driver.findElement(productName).getText();
    }

    public String getDescribeItem() {
        return driver.findElement(productDesc).getText();
    }

    public String getPriceItem() {
        return driver.findElement(productPrice).getText();
    }

    public String getCountItem() {
        return driver.findElement(productCount).getText();
    }

    //10
    public void clickRemoveItem() {
        driver.findElement(removeButton).click();
    }

    //11
    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    //13
    public void clickCheckoutButton(){
        Locators locators = new Locators(driver);
        locators.clickButtonByID("checkout");
    }
}