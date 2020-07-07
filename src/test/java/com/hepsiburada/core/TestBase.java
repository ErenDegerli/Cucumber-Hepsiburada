package com.hepsiburada.core;

import com.hepsiburada.driver.SetDriver;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public static String secondProductName;
    public static String thirdProductName;
    protected static WebDriver driver = SetDriver.initializeDriver();

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
