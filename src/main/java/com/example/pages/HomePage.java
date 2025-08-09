package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object for the demo home page (demoqa.com)
 */
public class HomePage extends BasePage {

    @FindBy(css = "div.home-banner")
    private WebElement banner;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://amazon.com");
    }

    @Override
    public boolean isAt() {
        try {
            return banner.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
