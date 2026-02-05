package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListProductPage {
    WebDriver driver;

    //Constructor
    public ListProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By sortingDropdown = By.className("product_sort_container");
    By addSauceLabsBikeLightToCart = By.id("add-to-cart-sauce-labs-bike-light");
    By cartButton = By.className("shopping_cart_link");
    By productName = By.id("item_0_title_link");
    By productDesc = By.className("inventory_item_desc");
    By productPrice = By.className("inventory_item_price");
    By removeButton = By.className("btn");

    //Task2
    public void sortingToPrice() {
        Select select = new Select(driver.findElement(sortingDropdown)); // Use Select with <select> tag. NO click
        select.selectByValue("lohi");
    }

    public void addItemToCart() {
        driver.findElement(addSauceLabsBikeLightToCart).click();
    }

    //7
    public void clickOnCart() {
        driver.findElement(cartButton).click();
    }

    //8,9
    public String getNameItem() {
        return driver.findElement(productName).getText();
    }

//    public String getDescribeItem(String productName) {
//        return driver.findElement(
//                By.xpath(
//                        "//div[@class='inventory_item']" +
//                                "[.//div[@class='inventory_item_name' and normalize-space()='" + productName + "']]" +
//                                "//div[@class='inventory_item_desc']"
//                )
//        ).getText();
//    }

    public String getDesc(){
        return driver.findElement(productDesc).getText();
    }


    public String getPriceItem() {
        return driver.findElement(productPrice).getText();
    }

    //10,11
    public void clickRemoveItem() {
        driver.findElement(removeButton).click();
    }

    //12
    public void addSauseLabsBackpackItemToCart(){
        Locators locator = new Locators(driver);
        locator.addItemToCardByID("add-to-cart-sauce-labs-backpack");
    }
}
