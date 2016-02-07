package com.paxotech.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by masihur on 1/31/16.
 */
public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }


}
