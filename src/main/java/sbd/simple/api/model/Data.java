package sbd.simple.api.model;

import org.json.JSONArray;
import org.json.JSONObject;
import sbd.simple.api.util.JasonData;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Data {
    private Boolean show;
    private JSONArray dates;

    private JSONArray values = new JSONArray();
    private JasonData jasonData = new JasonData();

    public Boolean getShow() {
        this.show = this.jasonData.getData().getJSONObject("data").getBoolean("show");
        return this.show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public JSONArray getDates() {
        this.dates = this.jasonData.getData().getJSONObject("data").getJSONArray("dates");
        return this.dates;
    }

    public void setDates(JSONArray dates) {
        this.dates = dates;
    }

    public JSONArray getValues() {

        JSONArray values = this.jasonData.getData().getJSONObject("data").getJSONArray("values");
        for (int i=0; i<values.length(); i++) {
            JSONObject _ticket = values.getJSONObject(i);

            Ticket ticket = new Ticket();
            ticket.setFrom_station_telecode(_ticket.getString("from_station_telecode"));
            ticket.setTo_station_telecode(_ticket.getString("to_station_telecode"));
            ticket.setFrom_station_telecode_name(_ticket.getString("from_station_telecode_name"));
            ticket.setTo_station_telecode_name(_ticket.getString("to_station_telecode_name"));

            Map<String, String> _values = new HashMap<String, String>();
            _values.put("20170801", _ticket.getJSONObject("values").getString("20170801"));
            _values.put("20170730", _ticket.getJSONObject("values").getString("20170730"));
            _values.put("20170731", _ticket.getJSONObject("values").getString("20170731"));
            _values.put("20170729", _ticket.getJSONObject("values").getString("20170729"));

            ticket.setValues(_values);

            this.values.put(ticket);
        }

        return this.values;
    }

    public void setValues(JSONArray values) {
        this.values = values;
    }
}
