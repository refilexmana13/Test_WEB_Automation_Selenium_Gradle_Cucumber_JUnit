package com.refi.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    By tshirtItem = By.xpath("//*[@id=\"item_1_title_link\"]/div");

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String validateHomePage(){
        return driver.findElement(tshirtItem).getText();
    }
}
