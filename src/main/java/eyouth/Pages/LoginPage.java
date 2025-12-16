package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By errorMessage = By.cssSelector(".MuiAlert-message.muirtl-1xsto0d");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By emptyUsername = By.cssSelector("#username-helper-text");
    private By emptyPassword = By.cssSelector("#password-helper-text");
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void setUsername(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }
    public void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }
    public void clickLogin(){
    wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
}

    public String getExpectedMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
    public String getEmptyUsernameMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emptyUsername)).getText();
    }
    public String getEmptyPasswordMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emptyPassword)).getText();
    }
}
