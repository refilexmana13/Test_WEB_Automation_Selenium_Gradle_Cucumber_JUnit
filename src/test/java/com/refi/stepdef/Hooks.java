package com.refi.stepdef;

import com.refi.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){

        getDriver();
    }

    @After
    public void afterTest(){

        driver.quit();
    }

}
