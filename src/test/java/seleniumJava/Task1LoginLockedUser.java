//Task 1:
//
//1. Open the site https://www.saucedemo.com/
//2. in the login field enter the login: 'locked_out_user', in the password field enter 'secret_sauce', click the 'LOGIN' button.
//3. check that the user is on the login page (element with attribute class = 'login_logo' is present)
//4. check that Warning Message 'Epic sadface: Sorry, this user has been locked out.' is displayed on the page.
//5. close Warning message

package seleniumJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1LoginLockedUser {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        //Set up the Chrome driver
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    @DisplayName("Check that locked user cannot log in to the system")
    @Tag("login")
    public void testLogin() {
        loginPage.enterUserName("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        WebElement element = driver.findElement(By.className("error-message-container"));
        assertTrue(element.isDisplayed(), "Error message is NOT displayed. The User is NOT on the login page.");
    }
}