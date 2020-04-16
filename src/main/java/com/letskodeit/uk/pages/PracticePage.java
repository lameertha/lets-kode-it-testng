package com.letskodeit.uk.pages;

import com.letskodeit.uk.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {
    By getPracticePageText = By.xpath("//h1[contains(text(),'Practice Page')]");

    public String getPracticePageMessage() {
        return getTextFromElement(getPracticePageText);
    }
}




