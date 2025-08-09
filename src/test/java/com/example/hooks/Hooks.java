package com.example.hooks;

import com.example.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before() {
        // init happens lazily in DriverFactory.getDriver()
        DriverFactory.getDriver();
    }

    @After
    public void after() {
        DriverFactory.quitDriver();
    }
}
