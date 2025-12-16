package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By menuButton = By.id("basic-button");

    private By searchButton = By.className("search-button");

    private By searchInput = By.id("highlights-demo");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public EYouthPage searchFor(String keyword) {

        wait.until(ExpectedConditions.presenceOfElementLocated(menuButton)).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(searchInput))
        .sendKeys(keyword);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        return new EYouthPage(driver);
    }
}
