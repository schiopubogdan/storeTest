package storeTests;

import org.junit.Test;

public class LoginTest extends BaseTests {
    @Test
    public void shouldSuccessfullyLogin(){
        homePage.clickSignInButton();
        authenticationPage.enterEmailAddress("schiopubogdan1999@yahoo.com");
        authenticationPage.enterPassword("alabala");
        authenticationPage.clickSignInButton();
        myAccountPage.checkWelcomeMessage("Welcome to your account. Here you can manage all of your personal information and orders.");
        myAccountPage.signOut();
    }
}
