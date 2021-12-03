package com.citrix.testcases;

import com.citrix.facade.DragAndDropFacade;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TapTests extends BaseTest {

    /*
    1. Try to reuse the code but inheritance should be the last solution
    2. Never Hard code
    3.Make it easy for others to follow or write test case
    4. Clean code
    5. Keep right things in right place
     */

    @Test(dataProvider = "getData")
    public void tapTest(Map<String, String> map) throws MalformedURLException {
        //new HomePage().clickOnMenuItems("Animation");
        // new HomePage().clickOnViews().clickOnMenuItem("Drag and Drop"); Facade

        String successMessage = new DragAndDropFacade()
                .navigateToDragAndDropPage()
                .getDragAndDropPage()
                .performDragAndDrop()
                .getSuccessMessage();

        assertThat(successMessage)
                .isEqualTo("Dropped!");
    }

    /*@DataProvider(parallel = true)
    public Object[] getData() {

        Map<String, String> map = new HashMap<>();
        map.put("udid", "192.168.1.102:5555");
        map.put("os_version", "10.0");

        Map<String, String> map1 = new HashMap<>();
        map.put("udid", "emulator-5554");
        map.put("os_version", "10.0");

        List<Map<String, String>> list = new ArrayList<>();
        // list.add(map);
        list.add(map1);

        return list.toArray();

        // return new Object[]{map, map1};;
    }


    @DataProvider(parallel = true)
    public Object[] getData2() throws IOException {

        HashMap<String, String> map = new ObjectMapper().readValue(new File(System.getProperty("user.dir")
                + "src/test/java/resources/jsontestdata/iteration1.json"), HashMap.class);

        HashMap<String, String> map1 = new ObjectMapper().readValue(new File(System.getProperty("user.dir")
                + "src/test/java/resources/jsontestdata/iteration2.json"), HashMap.class);

        return new Object[]{map, map1};
        ;
    }*/
}
