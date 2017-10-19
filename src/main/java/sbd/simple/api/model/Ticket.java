package sbd.simple.api.model;

import org.json.JSONObject;

import java.util.Map;

public class Ticket {
    private String from_station_telecode;
    private String to_station_telecode;
    private String from_station_telecode_name;
    private String to_station_telecode_name;
    private Map<String, String> values;

    public String getFrom_station_telecode() {
        return from_station_telecode;
    }

    public void setFrom_station_telecode(String from_station_telecode) {
        this.from_station_telecode = from_station_telecode;
    }

    public String getTo_station_telecode() {
        return to_station_telecode;
    }

    public void setTo_station_telecode(String to_station_telecode) {
        this.to_station_telecode = to_station_telecode;
    }

    public String getFrom_station_telecode_name() {
        return from_station_telecode_name;
    }

    public void setFrom_station_telecode_name(String from_station_telecode_name) {
        this.from_station_telecode_name = from_station_telecode_name;
    }

    public String getTo_station_telecode_name() {
        return to_station_telecode_name;
    }

    public void setTo_station_telecode_name(String to_station_telecode_name) {
        this.to_station_telecode_name = to_station_telecode_name;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
