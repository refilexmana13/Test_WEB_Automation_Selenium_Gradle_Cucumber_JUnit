package com.refi.stepdef;


import com.refi.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.refi.pages.LoginPage;

public class LoginStepDef extends BaseTest {
    //attribut
    protected LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        //inisialisasi
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username text with {string}")
    public void userInputUsernameTextWith(String username) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.inputUsername(username);
    }

    @And("user input password on password text box with {string}")
    public void userInputPasswordOnPasswordTextBoxWith(String password) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginButton();
    }

    @Then("user sees error message {string}")
    public void userSeesErrorMessage(String errorMessage) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.validateErrorAppear(errorMessage);
    }

    @And("User leaves the username field empty {string}")
    public void userLeavesTheUsernameFieldEmpty(String arg0) {
        // Write code here that turns the phrase above into concrete actions
    }
}
