package com.refi.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class LoginPage {
    WebDriver driver;
    //atribut
    By inputTextUsername = By.cssSelector("input#user-name");
    By inputTextPassword = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Method-method
    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username){
        driver.findElement(inputTextUsername).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(inputTextPassword).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
