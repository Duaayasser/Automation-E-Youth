package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EYouthPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By pageTitle = By.tagName("h1");

    public EYouthPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getPageTitle() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(pageTitle))
                   .getText();
    }
}
