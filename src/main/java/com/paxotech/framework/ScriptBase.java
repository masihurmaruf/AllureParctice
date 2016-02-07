package com.paxotech.framework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by masihur on 1/31/16.
 */
public class ScriptBase {

    protected WebDriverSteps steps;

    @BeforeMethod
    public void setUp(){
        steps = new WebDriverSteps(new FirefoxDriver());
        steps.openMainPage();
        steps.maximisingWindow();

    }
    @AfterMethod
    public void tearDown(){
        steps.quit();
    }
}
