package com.citrix.pages;

import com.citrix.driver.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    /* 1.page Factory
       2.By locators
       3.String locators
    */

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    @iOSXCUITFindBy(accessibility = "Views")
    private AndroidElement views;

    @AndroidFindBy(xpath = "//android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "Views")
    private List<MobileElement> menuItems;

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    public ViewsLandingPage clickOnViews() {
        // views.click();
        click(views, "views");
        return new ViewsLandingPage();
    }

    public void clickOnMenuItems(String menu) {
        chooseItemAndClick(menuItems, menu);
    }


}
