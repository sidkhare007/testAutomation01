package com.example.core;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Simple config reader - use environment overrides with -Denv=qa
 */
public class ConfigReader {
    private static Properties props = new Properties();

    static {
        try (InputStream in = new FileInputStream("src/test/resources/config.properties")) {
            props.load(in);
        } catch (Exception e) {

            System.out.println("Could not load config.properties, using defaults. " + e.getMessage());
        }
    }

    public static String get(String key, String defaultValue) {
        String v = System.getProperty(key);
        if (v != null) return v;
        v = System.getenv(key.toUpperCase());
        if (v != null) return v;
        return props.getProperty(key, defaultValue);
    }
}
