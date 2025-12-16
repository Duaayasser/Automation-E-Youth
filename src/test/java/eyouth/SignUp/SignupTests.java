package eyouth.SignUp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import eyouth.Base.BaseTests;
import eyouth.Pages.SignupPage;

public class SignupTests extends BaseTests{
     @Test
    public void joinUSTest(){
        homePage.clickJoinUS();
        SignupPage signUpPage = homePage.joinAsStudent();
        String currURL = driver.getCurrentUrl();
        assertTrue(currURL.contains("/signup"));
    }
    @Test
    public void signupTest(){
        homePage.clickJoinUS();
        SignupPage signUpPage = homePage.joinAsStudent();
        String name = "Duaa Yasser";
        String emailValue = "doaay55@gmail.com";
        String phoneValue = "0115668426";
        String passwordValue = "5555555duaa";
        String expectedMessage = " اسم المستخدم مطلوب";
        signUpPage.fillSignupFormWithoutUsername(name,emailValue,phoneValue,passwordValue);
        signUpPage.scrollToButton();
        signUpPage.clickChekBox();
        signUpPage.clickCreatAccount();
        assertTrue(signUpPage.getErrorMessage().contains(expectedMessage.trim()));

    }
    
}
