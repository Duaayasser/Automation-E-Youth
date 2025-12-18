package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By cousreTitle = By.xpath("//h5[contains(text(),'Retail Banking | الخدمات المصرفية للأفراد')]");
    private By cardButton = By.xpath("//a[@href='https://apps.experience.eyouthlearning.com/payment']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
    public PaymentPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public String getCourseTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cousreTitle)).getText();
    }
    public void clickCardButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cardButton)).click();
    }
}
