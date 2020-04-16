package com.letskodeit.uk.pages;

import com.letskodeit.uk.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By practiceLink = By.partialLinkText("Practi");

    By loginLink = By.partialLinkText("Login");

    By signUpLink = By.id("header-sign-up-btn");


    public void clickOnLogin() {
        clickOnElement(loginLink);
    }

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }

    public void clickOnSignUpLink() {
        clickOnElement(signUpLink);
    }
}

