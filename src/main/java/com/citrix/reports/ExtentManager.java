package com.citrix.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    public ExtentManager() {
    }

    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    static ExtentTest getExtentTest() {
        return test.get();
    }

    public static void setExtentTest(ExtentTest extentTest) {
        test.set(extentTest);
    }

    public static void unload() {
        test.remove();
    }
}
