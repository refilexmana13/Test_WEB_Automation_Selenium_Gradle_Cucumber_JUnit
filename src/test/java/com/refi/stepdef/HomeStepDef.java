package com.refi.stepdef;


import com.refi.BaseTest;
import com.refi.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user will be redirected to homepage")
    public void userWillBeRedirectedToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateHomePage();
    }
}
