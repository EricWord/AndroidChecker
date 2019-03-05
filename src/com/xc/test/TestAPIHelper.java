package com.xc.test;

import com.xc.tools.api.APIHelper;
import com.xc.tools.time.TimeConvert;
import org.junit.Test;


/**
 * 测试APIHelper
 */

public class TestAPIHelper {
    @Test
    public void test() {
        long start = System.currentTimeMillis();

        APIHelper.handle("E:\\BiSheProjects\\test\\DataReport.smali", "E:\\BiSheProjects\\test\\res\\res.txt");
        long end = System.currentTimeMillis();
        TimeConvert.convert((end - start));
    }
}
