package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
    private WebDriver driver;

    // 1. Locators (Identifiers for web elements)
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    // 2. Constructor to pass the browser instance
    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Page Actions (Reusable methods)
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }
}
