package com.letskodeit.uk.testsuite;

import com.letskodeit.uk.loadproperty.LoadProperty;
import com.letskodeit.uk.pages.HomePage;
import com.letskodeit.uk.pages.LoginPage;
import com.letskodeit.uk.pages.SignUpPage;
import com.letskodeit.uk.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    LoginPage loginPage=new LoginPage();
    LoadProperty loadProperty=new LoadProperty();

    @Test
    @Parameters({"Name","Password"})
    public void verifyUserShouldNavigateToSignUpPage(){
        homePage.clickOnSignUpLink();
        String expectedResult = "Sign Up to Let's Kode ";
        String actualResult = signUpPage.getSignUpText();
        Assert.assertEquals(expectedResult,actualResult);


    }
}


