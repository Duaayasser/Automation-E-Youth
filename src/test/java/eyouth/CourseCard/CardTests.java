package eyouth.CourseCard;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.AllCoursesPage;

public class CardTests extends BaseTests{
    @Test
    public void cardUITest(){
        AllCoursesPage allCoursesPage = homePage.hoverAndSelectFirstOption();
        assertTrue(allCoursesPage.crsImageIsDisplayed(), "Course image not displayed");
        assertTrue(allCoursesPage.crsTitleIsDisplayed(), "Course title not displayed");
        assertTrue(allCoursesPage.crsInstructorIsDisplayed(), "Instructor name not displayed");
        assertTrue(allCoursesPage.crsSubscribeBtnIsDisplayed(), "Subscribe button not displayed");
    }
    
}
