package eyouth.HomePage;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.EYouthPage;
import eyouth.Pages.HomePage;

public class SearchTests extends BaseTests {

    @Test
    public void searchWithValidKeyword() {

        String searchData = "كيف تنضم إلى البنك";
          EYouthPage eYouthPage = homePage.searchAndSelectFromDropdown(searchData);

        assertTrue(
            eYouthPage.getPageTitle().contains(searchData),
            "Page title does not contain expected text"
        );
    }
}
