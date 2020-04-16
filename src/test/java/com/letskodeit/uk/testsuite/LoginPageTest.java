package com.letskodeit.uk.testsuite;

import com.letskodeit.uk.loadproperty.LoadProperty;
import com.letskodeit.uk.pages.HomePage;
import com.letskodeit.uk.pages.LoginPage;
import com.letskodeit.uk.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty=new LoadProperty();

    @Test
    public void verifyUserCanNavigateToLoginPage() {
        homePage.clickOnLogin();
        String expectedResult = "Log In to Let's Kode It";
        String actualResult = loginPage.getLoginWelcomeMessage();
        Assert.assertEquals(expectedResult, actualResult);
    }


}


