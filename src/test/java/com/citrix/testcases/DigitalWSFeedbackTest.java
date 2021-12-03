package com.citrix.testcases;

import com.citrix.pages.WorkspaceFeedbackPage;
import com.citrix.pages.WorkspaceHomePage;
import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DigitalWSFeedbackTest extends BaseTest {


    @Test(dataProvider = "getData")
    public void workspaceFeedbackTest(Map<String, String> map) throws MalformedURLException {

        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new WorkspaceHomePage()
                .clickOnActions()
                .clickOnDigitalWorkspaceFeedback();

        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);

        new WorkspaceFeedbackPage()
                .choseOtherOption()
                .enterService()
                .chooseAccessing()
                .enterAccessingMethod()
                .feedbackDetails()
                .rate()
                .submit();
        Uninterruptibles.sleepUninterruptibly(40, TimeUnit.SECONDS);
    }

    @DataProvider(parallel = true)
    public Object[] getData() {

        Map<String, String> map = new HashMap<>();
        map.put("udid", "192.168.1.101:5555");
        map.put("os_version", "10.0");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);

        return list.toArray();

    }


}
