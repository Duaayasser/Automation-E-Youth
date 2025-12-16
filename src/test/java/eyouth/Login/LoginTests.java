package eyouth.Login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.LoginPage;
import eyouth.Utils.LoginData;

public class LoginTests extends BaseTests{
    @Test(dataProvider = "invalidCredentialsData", dataProviderClass = JsonDataProvider.class)
    public void invalidUsernameLogin(LoginData data){
        LoginPage loginPage = homePage.clickLoginFromHome();
        loginPage.setUsername(data.username);
        loginPage.setPassword(data.password);
        loginPage.clickLogin();
        String message = "اسم المستخدم أو كلمة المرور غير صحيحة";
        assertTrue(loginPage.getExpectedMessage().contains(message));
    }
    
}
