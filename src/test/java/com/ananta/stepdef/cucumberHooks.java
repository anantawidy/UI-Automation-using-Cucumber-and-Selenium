package com.ananta.stepdef;

import com.ananta.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
