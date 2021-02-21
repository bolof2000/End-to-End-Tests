package loginTests;

import UI.API.pages.HomePage;
import UI.API.pages.LoginPage;
import UI.API.pages.SecureAreaPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage;
    SecureAreaPage secureAreaPage;


    @Test
    public void testSuccessfulLogin() {
        // HomePage homePage = new HomePage(driver);
        loginPage = homePage.clickFormAuthentication();
        secureAreaPage = loginPage.setLoginCredentials("tomsmith", "SuperSecretPassword!");

        String verifyText = secureAreaPage.secureAreaText();
        Assert.assertTrue(verifyText.contains("You logged into a secure area!"));


    }


    @Test
    public void testUnSuccessfulLogin() {
        // HomePage homePage = new HomePage(driver);
        loginPage = homePage.clickFormAuthentication();
       secureAreaPage = loginPage.setLoginCredentials("tomsmith1", "SuperSecretPassword!");

        String verifyText = loginPage.invalidLogin();
        Assert.assertTrue(verifyText.contains("Your username is invalid"));
    }
}
