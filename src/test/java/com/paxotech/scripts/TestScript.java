package com.paxotech.scripts;

import com.paxotech.framework.ScriptBase;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by masihur on 1/31/16.
 */
@Title("Heatclinic Test")
public class TestScript extends ScriptBase {

    @Test
    public void test(){
        steps.homePage().enterSearch("hot")
                        .and()
                        .clickSearch();
    }
}
