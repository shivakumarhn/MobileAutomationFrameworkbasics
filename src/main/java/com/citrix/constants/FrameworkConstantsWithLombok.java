package com.citrix.constants;

import java.util.Objects;

public class FrameworkConstantsWithLombok {


//Generating getters without single to class and with static variables
  /*  private static final @Getter String resourcePath = System.getProperty("user.dir") + "/src/test/resources";
    private static final @Getter String apkFilePath = resourcePath + "/apkfiles/ApiDemos-debug.apk";
    private static final @Getter String configFilePath = resourcePath + "/config/config.properties";
*/


    //To call below nonstatic methods, we need to create  new object every time so to avoid it use single ton method

    private static FrameworkConstantsWithLombok frameworkConstantsWithLombok;

    public static synchronized FrameworkConstantsWithLombok getInstance() { // Synchronized is to avoid conflict b/w multiple access
        if (Objects.isNull(frameworkConstantsWithLombok))
            frameworkConstantsWithLombok = new FrameworkConstantsWithLombok();
        return frameworkConstantsWithLombok;
    }

    private static final String resourcePath = System.getProperty("user.dir") + "/src/test/resources";
    private static final String apkFilePath = resourcePath + "/apkfiles/ApiDemos-debug.apk";
    private static final String configFilePath = resourcePath + "/config/config.properties";

}
