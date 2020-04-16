package com.letskodeit.uk.testsuite;

import com.letskodeit.uk.loadproperty.LoadProperty;
import com.letskodeit.uk.pages.HomePage;
import com.letskodeit.uk.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoadProperty loadProperty=new LoadProperty();

    @Test
    public void verifyUserCanNavigateTomyCoursePage() {
        homePage.clickOnLogin();
    }@Test
    public void verifyUserCanNavigateToallCoursePage(){
        homePage.clickOnPracticeLink();
    }@Test
    public void verifyUserShouldNavigateTopracticePage(){
        homePage.clickOnSignUpLink();
    }


}
