package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EYouthPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By pageTitle = By.xpath("//div[@class='courseDetails_titleContainer__kJIO4']//h1[@class='courseDetails_courseTitle__tmIRd'][contains(text(),'كيف تنضم إلى البنك')]");

    public EYouthPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle))
                   .getText();
    }
}
