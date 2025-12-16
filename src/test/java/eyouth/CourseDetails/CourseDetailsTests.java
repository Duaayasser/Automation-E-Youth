package eyouth.CourseDetails;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import eyouth.Base.BaseTests;
import eyouth.Pages.AllCoursesPage;
import eyouth.Pages.CourseDetailsPage;

public class CourseDetailsTests extends BaseTests{
    @Test
    public void checkCourseDetails(){
        AllCoursesPage allCoursesPage = homePage.hoverAndSelectFirstOption();
        CourseDetailsPage courseDetailsPage = allCoursesPage.clickCourseCard();
        String currURL = driver.getCurrentUrl();
        String subTitle = "حول الدورة التدريبية:";
        assertTrue(currURL.contains("details"),"The URL is incorrect");
        assertTrue(courseDetailsPage.getPageSubTitle().contains(subTitle),
    "Page title does not contain expected text");
    }
}
