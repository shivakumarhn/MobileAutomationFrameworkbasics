package com.citrix.reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Objects;

public class ExtentReport {

    private static ExtentReports extent;
    //public static ExtentTest test;  Provide thread safety for this since multiple tests can access at same time

    public static void initReports() {
        //Initialisation part
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/index.html");
            spark.config().setTheme(Theme.DARK);
            spark.config().setReportName("Workspace report");
            spark.config().setDocumentTitle("Automation report");
            extent.attachReporter(spark);
        }

    }

    public static void tearDownReports() {
        if (Objects.nonNull(extent)) {
            extent.flush();
            ExtentManager.unload();
        }
    }

    public static void createTest(String testCaseName) {
        ExtentManager.setExtentTest(extent.createTest(testCaseName));
    }
}
