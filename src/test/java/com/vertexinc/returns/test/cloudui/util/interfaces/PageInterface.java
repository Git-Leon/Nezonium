package com.vertexinc.returns.test.cloudui.util.interfaces;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public interface PageInterface {

    FluentWait<WebDriver> getWaitDriver();

     WebDriver getBrowser();

    default void clickBackButton() {
        getBrowser().navigate().back();
    }

    default void clickForwardButton() {
        getBrowser().navigate().forward();
    }

    default void clickRefreshButton() {
        getBrowser().navigate().refresh();
    }

    default void click(By webElement) {
        getBrowser().findElement(webElement).click();
    }

    /*
        @After annotation through inheritance not working to expectation
    //    default void tearDown()
    //    explicitly calling as workaround.
        */
    default void tearDown() {
//        Wait a few seconds to see results in-action or take screenshot
//        try {
//            wait(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        takeScreenShot();

        if (getBrowser() != null)
            getBrowser().quit();
    }

}
