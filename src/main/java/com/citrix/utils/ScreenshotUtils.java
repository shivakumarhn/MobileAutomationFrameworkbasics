package com.citrix.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.citrix.driver.DriverManager.getDriver;

public final class ScreenshotUtils {

    private ScreenshotUtils() {
    }

    public static String getBase64Image() {
        return ((TakesScreenshot)
                getDriver()).getScreenshotAs(OutputType.BASE64);
    }

}
