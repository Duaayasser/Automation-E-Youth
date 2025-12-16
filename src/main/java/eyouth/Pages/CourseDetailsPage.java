package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CourseDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By pageSubTitle = By.xpath("//h2[contains(text(),'حول الدورة التدريبية:')]");
    public CourseDetailsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getPageSubTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageSubTitle))
                   .getText();
    }
}
