package com.refi;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( // Konfigurasi
        features = "src/test/resources",
        glue = "com.refi",
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}
)
public class CucumberTest {
}
