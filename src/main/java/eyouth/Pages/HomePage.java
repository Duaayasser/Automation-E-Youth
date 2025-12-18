package eyouth.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private Actions actions;
    private By searchInput = By.id("highlights-demo");

    private By searchSuggestions = By.xpath("//span[normalize-space()='How to Join a Bank |']");

    private By searchButton = By.className("search-button");
    private By coursesHover = By.xpath("//a[contains(text(),'دوراتنا التدريبية')]");
    private By allCoursesOption = By.xpath("//a[contains(text(),'جميع الدورات')]");
    private By joinUSButton = By.cssSelector(".btn.btn-outline-primary.mx-1.navbar_btn_signup__z4Cok");
    private By joinAsStudent = By.cssSelector("a:nth-child(1) div:nth-child(1)");
    private By loginButton = By.xpath("//button[contains(@class,'navbar_btn_signin__aLCnP')]");
    private By showAllButton = By.xpath("(//button[@class='btn btn-primary TopRanking_btn_see_all__-QYhB'])[1]");
    private By logo = By.xpath("//img[@alt='iao-logo']");
    private By facebookIcon = By.xpath("//a[contains(@href,'https://www.facebook.com/EYouthLearning/')]");
    private By linkedinIcon = By.xpath("//a[contains(@href,'https://www.linkedin.com/company/eyouth/mycompany/verification/')]");
    private By instgramIcon = By.xpath("//a[contains(@href,'https://instagram.com/eyouthlearning?igshid=YmMyMTA2M2Y=')]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.actions = new Actions(driver);
    }
    public EYouthPage searchAndSelectFromDropdown(String searchText) {

        WebElement input = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchInput));
        input.clear();
        input.sendKeys(searchText);

        List<WebElement> suggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(searchSuggestions));

        suggestions.get(0).click();

        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        return new EYouthPage(driver);
    }
    public AllCoursesPage hoverAndSelectFirstOption() {

        WebElement menu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(coursesHover));

        actions.moveToElement(menu).perform();

        List<WebElement> options = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(allCoursesOption));

        options.get(0).click();

        return new AllCoursesPage(driver);
    }
    public void clickJoinUS(){
        wait.until(ExpectedConditions.elementToBeClickable(joinUSButton)).click();
    }
    public SignupPage joinAsStudent(){
        wait.until(ExpectedConditions.elementToBeClickable(joinAsStudent)).click();
        return new SignupPage(driver);
    }
    public LoginPage clickLoginFromHome(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new LoginPage(driver);
    }
    public void scrollToShowAllButton(){
    WebElement button = wait.until(
        ExpectedConditions.presenceOfElementLocated(showAllButton)
    );
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView({block:'center'});", button);
}

  public AllCoursesPage clickShowAllButton(){
    WebElement button = wait.until(
        ExpectedConditions.visibilityOfElementLocated(showAllButton)
    );

    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", button);

    return new AllCoursesPage(driver);
}
public void scrollToLogo(){
    WebElement scrollLogo = wait.until(
        ExpectedConditions.presenceOfElementLocated(logo)
    );
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView({block:'center'});", scrollLogo);
}
    public FacebookPage clickFacebook(){
    WebElement fb = wait.until(
        ExpectedConditions.presenceOfElementLocated(facebookIcon)
    );

    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", fb);

    return new FacebookPage(driver);
}

    public LinkedinPage clickLinkedin(){
         WebElement li = wait.until(
        ExpectedConditions.presenceOfElementLocated(linkedinIcon)
    );

    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", li);

    return new LinkedinPage(driver);
    }
     public InstgramPage clickInstgram(){
         WebElement insta = wait.until(
        ExpectedConditions.presenceOfElementLocated(instgramIcon)
    );

    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", insta);

    return new InstgramPage(driver);
    }

}
