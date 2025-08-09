package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class ApiSteps {
    private Response resp;
    @Given("I call demoqa users API")
    public void callAPI() {
        resp = RestAssured.get("https://reqres.in/api/users?page=2"); // public dummy API
    }

    @Then("status code is 200")
    public void status200() {
        assertEquals(200, resp.getStatusCode());
    }
}
