package eyouth.HomePage;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.EYouthPage;
import eyouth.Pages.HomePage;

public class SearchTests extends BaseTests {

    @Test
    public void searchWithValidKeyword() {

        String keyword = "كيف تنضم إلى البنك";

        HomePage homePage = new HomePage(driver);
        EYouthPage eYouthPage = homePage.searchFor(keyword);

        assertTrue(
            eYouthPage.getPageTitle().contains(keyword),
            "Page title does not contain expected text"
        );
    }
}
