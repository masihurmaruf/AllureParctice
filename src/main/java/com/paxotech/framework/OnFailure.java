package com.paxotech.framework;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by masihur on 1/31/16.
 */
public class OnFailure extends TestListenerAdapter {
    @Step("Hi, I'm step in your TestNG listenner")
    @Override
    public void onTestFailure(ITestResult result){
        createAttachment();
    }
    @Attachment("Hi, I'm step in your TestNG listenner")
    public String createAttachment(){
        return "My own attachment body!";
    }

}
