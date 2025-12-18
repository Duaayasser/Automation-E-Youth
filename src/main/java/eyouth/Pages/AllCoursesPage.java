package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCoursesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By anyCourse = By.xpath("//div[@title='course-v1:Banking+RBPGZUO2024+RBZXCTD2024']");
    private By subscribeButton = By.xpath("(//button[contains(@aria-label,'button to be clicked')][contains(text(),'اشترك')])[4]");
    private By selectedCourseTitle = By.xpath("//p[contains(text(),'الخدمات المصرفية للأفراد')]");
    private By courseImage = By.xpath("//div[@title='course-v1:Banking+RBPGZUO2024+RBZXCTD2024']");
    private By courseInstructor = By.xpath("//strong[normalize-space()='Ahmed Mounir']");
    public AllCoursesPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public CourseDetailsPage clickCourseCard(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(anyCourse)).click();
        return new CourseDetailsPage(driver);
    }
    public PaymentPage clickSubscribe(){
        WebElement button = wait.until(
        ExpectedConditions.elementToBeClickable(subscribeButton)
    );

    button.click();
    return new PaymentPage(driver);
    }
    public String getSelectedCourseTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(selectedCourseTitle)).getText();
    }
    public boolean crsImageIsDisplayed(){
        return driver.findElement(courseImage).isDisplayed();
    }
    public boolean crsTitleIsDisplayed(){
        return driver.findElement(selectedCourseTitle).isDisplayed();
    }
    public boolean crsInstructorIsDisplayed(){
        return driver.findElement(courseInstructor).isDisplayed();
    }
    public boolean crsSubscribeBtnIsDisplayed(){
        return driver.findElement(subscribeButton).isDisplayed();
    }
}
