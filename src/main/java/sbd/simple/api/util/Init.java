package sbd.simple.api.util;

import java.io.*;

public class Init {
    private String initFile = "/Users/ariman/Workspace/WireMockDemo/SBD-simple-api/data/init.html";
    private String content = "";

    public Init() {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(initFile), "UTF-8"));

            String line;

            while ((line = buffer.readLine()) != null) {
                content = content + line + "\n";
            }

            buffer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String getContent() {
        return this.content;
    }

}
