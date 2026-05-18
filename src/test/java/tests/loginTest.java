package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginpage;

public class loginTest {
    private WebDriver driver;
    private loginpage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");
        loginPage = new loginpage(driver);
    }

    @Test(priority = 1)
    public void testValidLogin() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        String expectedUrl = "https://saucedemo.cominventory.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed with valid credentials!");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {
        loginPage.enterUsername("wrong_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        String errorText = loginPage.getErrorMessageText();
        Assert.assertTrue(errorText.contains("Username and password do not match"), "Error message not displayed!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
