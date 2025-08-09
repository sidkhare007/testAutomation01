package com.example.steps;

import com.example.pages.HomePage;
import com.example.core.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class HomeSteps {
    private HomePage home = new HomePage(DriverFactory.getDriver());

    @Given("user opens home page")
    public void openHome() {
        home.open();
    }

    @Then("home page is visible")
    public void verifyHome() {
        assertTrue(home.isAt());
    }
}
