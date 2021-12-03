package com.citrix.driver;

import com.citrix.exception.FrameworkException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.Map;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver get(Modes mode, Map<String, String> map) throws MalformedURLException {

        WebDriver driver = null;

        if (mode.equals(Modes.LOCAL)) {
            driver = new LocalDriverImp().getDriver(map);
        } else if (mode.equals(Modes.BS)) {
            driver = new BrowserStackImp().getDriver(map);
        } else if (mode.equals(Modes.SAUCELABS)) {
            driver = new SauceLabsImp().getDriver(map);
        } else if (mode.equals(Modes.PCLOUDY)) {
            driver = new Pcloudy().getDriver(map);
        } else {
            throw new FrameworkException("No cloud provider is configured with the name mentioned");
        }
        return driver;
    }
}
