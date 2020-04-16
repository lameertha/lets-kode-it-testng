package com.letskodeit.uk.pages;

import com.letskodeit.uk.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By clickOnCommitButton = By.name("commit");
    By getLoginText = By.xpath("//h1[@class='text-center']");
    By allCourseText = By.xpath("//a[contains(text(),'All Courses')]");



    public void setEmailField(String Email) {
        sendTextToElement(emailField,Email);
    }

    public void setPasswordField(String Password) {
        sendTextToElement(passwordField,Password);
    }

    public void setClickOnLoginButton() {

        clickOnElement(clickOnCommitButton);
    }

    public String getLoginWelcomeMessage() {
        return getTextFromElement(getLoginText);
    }
    public String getAllCourseMessage(){
        return getTextFromElement(allCourseText);
    }

}

