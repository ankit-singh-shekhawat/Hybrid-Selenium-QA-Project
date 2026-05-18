import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InventoryTest {
    public static void main(String[] args){
//        For opening the chrome browser
        WebDriver driver = new ChromeDriver();
//        For opening the url
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
//        For logging in
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
//        Adding element to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        Verifying the cart item
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        if(cartCount.equals("1")) {
            System.out.println("TEST PASSED: Item successfully added to cart!");
        } else {
            System.out.println("TEST FAILED: Cart count is incorrect.");
        }
        driver.quit();

    }
}
