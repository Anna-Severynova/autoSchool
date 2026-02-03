package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
    By sortingDropdown = By.className("product_sort_container");
    By addSauceLabsBikeLightToCart = By.id("add-to-cart-sauce-labs-bike-light");

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
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    //8,9
    public String getNameItem() {
        return driver.findElement(By.id("item_0_img_link")).getText();
    }

    public String getDescribeItem() {
        return driver.findElement(By.className("inventory_item_desc")).getText();
    }

    public String getPriceItem() {
        return driver.findElement(By.className("inventory_item_price")).getText();
    }
}