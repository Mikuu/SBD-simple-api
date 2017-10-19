package sdb.simple.api.util;

import org.junit.Test;
import sbd.simple.api.util.Init;

public class TestInit {
    private Init init = new Init();

    @Test
    public void TestInitContent() {
        String content = this.init.getContent();
        System.out.println(content);
    }
}
