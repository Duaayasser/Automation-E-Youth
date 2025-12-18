package eyouth.SocialMedia;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.FacebookPage;

public class SocialMediaTests extends BaseTests{
    @Test
    public void socialTest(){
        homePage.scrollToLogo();
        FacebookPage facebookPage = homePage.clickFacebook();
        String currURL = driver.getCurrentUrl();
        assertTrue(currURL.contains("facebook"));
    }
}
