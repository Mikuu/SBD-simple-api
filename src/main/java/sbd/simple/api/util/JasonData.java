package sbd.simple.api.util;

import org.json.JSONObject;

import java.io.*;

public class JasonData {
    public String jsonFile = "/Users/ariman/Workspace/WireMockDemo/SBD-simple-api/data/sample.json";
    JSONObject data;

    public JasonData() {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(jsonFile), "UTF-8"));

            String content = "";
            String line;

            while ((line = buffer.readLine()) != null) {
                content = content + line;
            }

            buffer.close();
            data = new JSONObject(content);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public JSONObject getData() {
        return this.data;
    }

}
