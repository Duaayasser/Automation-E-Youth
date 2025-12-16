package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By fullName = By.id("name");
    private By username = By.id("username");
    private By countryDropdown = By.id("country-select");
    private By genderDropdown = By.id("gender-select");
    private By stateDropdown = By.id("government-select");
    private By email = By.id("email");
    private By phone = By.id("phone_number");
    private By password = By.id("password");
    private By confirmPassword = By.id("confirmPassword");
    private By createAccButton = By.cssSelector("button[aria-label='button to be clicked'][type='submit']");
    private By errorMessage = By.id("username-helper-text");
    private By genderSelection = By.id("female");
    private By stateSelection = By.xpath("//li[contains(text(),'الشرقية')]");
    private By countrySelection = By.xpath("//li[contains(text(),'مصر')]");
    private By checkBox = By.id("accept");
    public SignupPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
    }
     public void fillSignupFormWithoutUsername(
        String name,
        String emailValue,
        String phoneValue,
        String passwordValue
    ) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName))
                .sendKeys(name);

        setCountry();
        setGender();
        setState();
        driver.findElement(email).sendKeys(emailValue);
        driver.findElement(phone).sendKeys(phoneValue);
        driver.findElement(password).sendKeys(passwordValue);
        driver.findElement(confirmPassword).sendKeys(passwordValue);
    }
    private void setGender(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(genderDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(genderSelection)).click();
    }
    private void setCountry(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(countrySelection)).click();
    }
    private void setState(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateDropdown)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(stateSelection)).click();
    }
    public void clickCreatAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAccButton)).click();
    }
    public String getErrorMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
    public void clickChekBox(){
        driver.findElement(checkBox).click();
    }
     public void scrollToButton(){
        WebElement button = driver.findElement(createAccButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView();";
        js.executeScript(script, button);
    }

    
}
