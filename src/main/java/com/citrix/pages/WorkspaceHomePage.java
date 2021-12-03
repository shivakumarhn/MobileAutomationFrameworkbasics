package com.citrix.pages;

import com.citrix.driver.DriverManager;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class WorkspaceHomePage extends BasePage {

    @AndroidFindBy(id = "home, current page")
    private AndroidElement activityFeed;

    @AndroidFindBy(accessibility = "all")
    private AndroidElement action;

    @AndroidFindBy(id = "apps")
    private AndroidElement apps;

    @AndroidFindBy(id = "files")
    private AndroidElement files;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Workspace Feedback Citrite Concierge']")
    private AndroidElement digitalWorkspaceFeedback;


    public WorkspaceHomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }


    public WorkspaceHomePage clickOnActions() {
        click(action, "Actions");
        return this;
    }

    public WorkspaceFeedbackPage clickOnDigitalWorkspaceFeedback() {
        scrollToSpecificElementAndClick(By.
                xpath("//android.widget.Button[@text='Digital Workspace Feedback Citrite Concierge']"), true);
        return new WorkspaceFeedbackPage();
    }

}
