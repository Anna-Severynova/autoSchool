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

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2TestWebShop {
    WebDriver driver;
    LoginPage loginPage;
    ListProductPage listProductPage;
    CartProductPage cartProductPage;
    CheckoutPage checkoutPage;
    FinishPage finishPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        listProductPage = new ListProductPage(driver);
        cartProductPage = new CartProductPage(driver);
        checkoutPage = new CheckoutPage(driver);
        finishPage = new FinishPage(driver);
    }

//    @AfterEach
//    public void closeBrowser(){
//        driver.quit();
//    }

    //3 (pass)
    @Test
    @DisplayName("Check that the User is on the main page")
    @Tag("check_product_list_page")
    public void testProductListPage() {
        WebElement element = driver.findElement(By.id("inventory_container"));
        assertTrue(element.isDisplayed(), "The User is NOT on the Product List page");
    }

    //5 (pass)
    @Test
    @DisplayName("Check the sorting to price -> from low to high")
    @Tag("sorting_to_price")
    public void testSortingToPrice() {
        listProductPage.sortingToPrice();
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        assertEquals("Price (low to high)", select.getFirstSelectedOption().getText());
    }

    //6 (pass)
    @Test
    @DisplayName("Check adding an item to the cart.")
    @Tag("add_item_to_cart")
    public void testAddItemToCart() {
        listProductPage.addItemToCart();
        WebElement element = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        assertTrue(element.isDisplayed(), "The Sauce Labs Bike Light is NOT added to the cart");
    }

    //7 (pass)
    @Test
    @DisplayName("Check the count of items in the cart")
    @Tag("count_items_in_cart")
    public void testCountItemsInCart() {
        listProductPage.addItemToCart();
        listProductPage.clickOnCart();
        WebElement element = driver.findElement(By.className("cart_quantity"));
        assertEquals("1", element.getText(), "There is NOT 1 item in the cart");
    }

    //8 (получить данные со страницы product list -> сохранить в переменную product cart -> сравнить),9
    @Test
    @DisplayName("Check that the saved data is corresponding to info in the cart")
    @Tag("save_product_data")
    public void testSaveProductData() {
        //add item to cart
        listProductPage.addItemToCart();
        //save product data
        String nameProdListPage = listProductPage.getNameItem();
        String countProdListPage = "1";
        String describeProdListPage = listProductPage.getDesc();
        String priceProdListPage = listProductPage.getPriceItem();
        //go to cart and compare
        listProductPage.clickOnCart();
        String nameProdCartPage = cartProductPage.getNameItem();
        String countProdCartPage = "1";
        String describeProdCartPage = cartProductPage.getDescribeItem();
        String priceProdCartPage = cartProductPage.getPriceItem();
        //compare
        assertEquals(nameProdCartPage, nameProdListPage, "Product name is NOT corresponding to product name in cart");
        assertEquals(countProdCartPage, countProdListPage, "Count of product is NOT corresponding to count of product in cart");
        assertEquals(describeProdCartPage, describeProdListPage, "Product describe is NOT corresponding to product describe in cart");
        assertEquals(priceProdCartPage, priceProdListPage, "Product price is NOT corresponding to product price in cart");
    }

    //10 (pass)
    @Test
    @DisplayName("Check removing item from cart")
    @Tag("remove_item")
    public void testRemoveItem() {
        listProductPage.addItemToCart();
        listProductPage.clickOnCart();
        cartProductPage.clickRemoveItem();
        List<WebElement> elements = driver.findElements(By.className("cart_item_label"));
        assertEquals(0, elements.size(), "The item is NOT removed");
    }

    //11 (pass)
    @Test
    @DisplayName("Check that User can continue shopping")
    @Tag("continue_shopping_button")
    public void testContinueShoppingButton() {
        listProductPage.addItemToCart();
        listProductPage.clickOnCart();
        cartProductPage.clickContinueShopping();
        WebElement element = driver.findElement(By.className("select_container"));
        assertTrue(element.isDisplayed(), "The User is NOT on Product List page");
    }

    //12,13,14,15,16,17 - pass
    @Test
    @DisplayName("Check that the item count on the Cart Page meet to item count on Finish Page")
    @Tag("add_item_to_cart")
    public void addItemToCart() {
        listProductPage.addSauseLabsBackpackItemToCart();
        WebElement element = driver.findElement(By.id("remove-sauce-labs-backpack"));
        assertTrue(element.isDisplayed(), "The item is NOT added to cart");
        listProductPage.clickOnCart();
        cartProductPage.getCountItem();
        String saveItemCart = cartProductPage.getCountItem();
        cartProductPage.clickCheckoutButton();
        checkoutPage.fillAndSendCheckoutInfo();
        checkoutPage.clickContinueCheckoutButton();
        String itemFinishPage = finishPage.getCountItem();
        assertEquals(saveItemCart, itemFinishPage, "Count on Cart page doesn't meet to count on Finish page");
        finishPage.clickFinishButton();
        WebElement element1 = driver.findElement(By.className("pony_express"));
        assertTrue(element1.isDisplayed(), "The user does NOT finish the order");
    }
}