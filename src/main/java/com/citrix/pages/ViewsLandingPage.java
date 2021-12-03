package com.citrix.pages;

import static com.citrix.utils.DynamicXpathUtils.getXpath;

public class ViewsLandingPage extends BasePage {

    //For Dynamic xpath with similar locators and string change

    // private String dragAndDrop = "//android.widget.TextView[@text='%replaceable']";
    private String dragAndDrop = "//android.widget.TextView[@text='%s']";

    public void clickOnMenuItem(String menuName) {

        /* String oldXpath = dragAndDrop.replace("%replaceable", menuName);
        String newXpath = String.format(dragAndDrop, menuName);*/

        String newXpath = getXpath(dragAndDrop, menuName);
        // DriverManager.getDriver().findElement(By.xpath(newXpath)).click();
        click("xpath", newXpath, "Drag and Drop");
    }
}
