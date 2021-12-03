package com.citrix.listeners;

import com.citrix.reports.ExtentLogger;
import com.citrix.reports.ExtentReport;
import org.testng.*;

import static com.citrix.reports.ExtentReport.initReports;
import static com.citrix.reports.ExtentReport.tearDownReports;

public class ListenersClass implements ITestListener, ISuiteListener {

    @Override //Before suite
    public void onStart(ISuite suite) {
        initReports();
    }

    @Override //After suite
    public void onFinish(ISuite suite) {
        tearDownReports();
    }

    @Override //Before method
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getName());
    }

    @Override //After method
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + "is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() + " is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getName() + "is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Don't provide any implementation
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
