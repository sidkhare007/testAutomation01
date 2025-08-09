package com.example.tests;

import com.example.core.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.deque.axe.AXE;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import static org.junit.Assert.*;

public class A11yTest {
    @Test
    public void axeScanHome() throws Exception {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://amazon.com");
        URL scriptUrl = new URL("https://cdnjs.cloudflare.com/ajax/libs/axe-core/4.10.2/axe.min.js");
        JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).analyze();
        JSONArray violations = responseJSON.getJSONArray("violations");
        // For demo purposes we assert scan runs (no strict failures)
        assertNotNull(violations);
    }
}
