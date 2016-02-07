package com.paxotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by masihur on 1/31/16.
 */
public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement searchBox;

    private WebElement searchBox(){
        searchBox = driver.findElement(By.name("q"));
        return searchBox;
    }
    private WebElement searchButton;
    private WebElement searchButton(){
        searchButton = driver.findElement(By.id("search_button"));
        return searchButton;
    }
    @Step("Enter text to search")
    public HomePage enterSearch(String text){
        searchBox().sendKeys(text);
        return new HomePage(driver);
    }
    @Step("Click Search Button")
    public HomePage clickSearch(){
        searchButton().click();
        return new HomePage(driver);
    }
    public HomePage and(){
        return new HomePage(driver);
    }

}
