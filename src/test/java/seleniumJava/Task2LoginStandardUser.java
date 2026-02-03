//Task 2:
//
//       1. Open the website https://www.saucedemo.com/
//       2. in the login field enter login: 'standard_user', in the password field enter 'secret_sauce', click the 'LOGIN' button.
//       3. check that the user is on the product list page (there is an element with attribute id = 'inventory_container')
//       4. change sorting to Price (Low to High)
//       5. make sure that sorting is applied on the page (check that the location of items on the page by price)
//       6. add the item 'Sauce Labs Bolt T-Shirt' to cart, check that the button on the product card has changed to 'Remove'.
//       7. check that the counter of goods in the cart is displayed with the value 1
//       8. save all data about the product added to the cart
//       9. go to the cart and check that the data about the product corresponds to the data saved at step 7
//      10. click Remove for the product, make sure that the goods counter in the cart is not displayed.
//      11. return to the product page by clicking the 'Continue Shopping' button.
//      12. add 'Sauce Labs Backpack' to your cart, memorize product data.
//      13. go to cart and click 'Checkout'
//      14. fill in the form and continue
//      15. on the Overview page check the Item total field to make sure it matches the price of the item.
//      16. click Finish
//      17. on the Thank You screen check that there is an image with attribute alt = 'Pony Express'.

package seleniumJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2LoginStandardUser {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    //3
    @Test
    @DisplayName("Check that the User is on the main page")
    @Tag("check_product_list_page")
    public void testProductListPage() {
        WebElement element = driver.findElement(By.id("inventory_container"));
        assertTrue(element.isDisplayed(), "The User is NOT on the Product List page");
    }

    //5
    @Test
    @DisplayName("Check the sorting to price -> from low to high")
    @Tag("sorting_to_price")
    public void testSortingToPrice() {
        loginPage.sortingToPrice();
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        assertEquals("Price (low to high)", select.getFirstSelectedOption().getText());
    }

    //6
    @Test
    @DisplayName("Check adding an item to the cart.")
    @Tag("add_item_to_cart")
    public void testAddItemToCart() {
        loginPage.addItemToCart();
        WebElement element = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        assertTrue(element.isDisplayed(), "The Sauce Labs Bike Light is NOT added to the cart");
    }

    //7
    @Test
    @DisplayName("Check the count of items in the cart")
    @Tag("count_items_in_cart")
    public void testCountItemsInCart() {
        loginPage.addItemToCart();
        loginPage.countItemsInCart();
        WebElement element = driver.findElement(By.className("cart_quantity"));
        assertEquals("1", element.getText(), "There is NOT 1 item in the cart");
    }
}