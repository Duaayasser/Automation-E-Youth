package eyouth.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCoursesPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By anyCourse = By.xpath("//div[@title='course-v1:Banking+RBPGZUO2024+RBZXCTD2024']");
    public AllCoursesPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public CourseDetailsPage clickCourseCard(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(anyCourse)).click();
        return new CourseDetailsPage(driver);

    }
}
