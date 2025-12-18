package eyouth.SocialMedia;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.FacebookPage;
import eyouth.Pages.InstgramPage;
import eyouth.Pages.LinkedinPage;

public class SocialMediaTests extends BaseTests{
    @Test
    public void socialTest(){
        homePage.scrollToLogo();
        FacebookPage facebookPage = homePage.clickFacebook();
        String currURL = driver.getCurrentUrl();
        assertTrue(currURL.contains("facebook"));
        getWindowManager().goBack();
        LinkedinPage linkedinPage = homePage.clickLinkedin();
        String currURL2 = driver.getCurrentUrl();
        assertTrue(currURL2.contains("linkedin"));
        getWindowManager().goBack();
        InstgramPage instgramPage = homePage.clickInstgram();
        String currURL3 = driver.getCurrentUrl();
        assertTrue(currURL3.contains("instagram"));
        getWindowManager().goBack();
    }
}
