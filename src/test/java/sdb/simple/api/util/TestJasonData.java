package sdb.simple.api.util;

import org.json.JSONObject;
import org.junit.Test;
import sbd.simple.api.util.JasonData;

import static org.junit.Assert.assertEquals;

public class TestJasonData {

    @Test
    public void testReadJasonData() {
        JasonData jasonData = new JasonData();
        JSONObject  data = jasonData.getData();
        System.out.println(data.toString());

        assertEquals(data.getString("validateMessagesShowId"), "_validatorMessage");
        assertEquals(data.getJSONObject("data")
                .getJSONArray("values")
                .getJSONObject(0)
                .getString("from_station_telecode"), "BJP");

    }
}
