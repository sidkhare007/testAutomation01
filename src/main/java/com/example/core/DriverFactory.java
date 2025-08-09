package com.example.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            initDriver();
        }
        return driver.get();
    }

    private static void initDriver() {
        String headless = ConfigReader.get("headless", "false");
        FirefoxOptions options = new FirefoxOptions();
        if (headless.equalsIgnoreCase("true")) options.addArguments("--headless=new", "--disable-gpu", "--window-size=1920,1080");
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver.set(new FirefoxDriver(options));
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
