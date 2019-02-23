package com.xc.test;

import com.xc.tools.decode.APKTool;
import com.xc.tools.time.TimeConvert;
import org.junit.Test;

public class TestAPKTool {

    @Test
    public void testAPKTool() {
        long start = System.currentTimeMillis();
        APKTool.decode("E:\\BiSheProjects\\APKs\\jinritoutiao.apk", "E:\\BiSheProjects\\test2");
        long end = System.currentTimeMillis();
        TimeConvert.convert((end-start));

    }
}
