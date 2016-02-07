package com.paxotech.framework;

import com.paxotech.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by masihur on 1/31/16.
 */
public class WebDriverSteps {

    private WebDriver driver;
    private HomePage homePage;

    public WebDriverSteps(WebDriver driver){
        this.driver = driver;
    }
    @Step
    public void openMainPage(){
        driver.navigate().to("http://qa1.paxotech.com/heatclinic");
    }
    @Step
    public void maximisingWindow(){
        driver.manage().window().maximize();
    }
    @Attachment
    public byte[] makeScreenshot(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    public void quit(){
        driver.quit();
    }

    public HomePage homePage(){
        if(homePage == null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

}
