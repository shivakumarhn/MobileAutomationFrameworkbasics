package com.citrix.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProviderDemo {

    @Test(dataProvider = "getData")
    public void dataProviderTest(Map<String, String> map) {
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
    }

    @DataProvider
    public String[][] getData1() {
        return new String[][]{
                {"Shiva", "1234"},
                {"Kumar", "4321"},
                {"mandya", "3124"}
        };
      /*  [] --> How many times you want to run your test --> 3
        [] --> How many parameter you want to feed to your test; --> 2*/
    }


    @DataProvider
    public Object[] getData() {
        Map<String, String> map = new HashMap<>();
        map.put("username", "Shiva");
        map.put("password", "9999");

        Map<String, String> map1 = new HashMap<>();
        map1.put("username", "kumar");
        map1.put("password", "7777");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);
        list.add(map1);

        return list.toArray();
    }


}
