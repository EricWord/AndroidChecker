package com.xc.tools.api;

import java.io.*;

/**
 * 提取API特征的工具类
 */
public class APIHelper {
    /*
    *
     * 主要提取思路：
     * 1.遍历每个.smali文件
     * 2.根据API在.smali文件中的格式声明：
     *  .method<访问权限>[修饰关键字]<API原型>
     *
     */

    /**
     * 读取.smali文件并提取API
     *
     * @param src  文件路径
     * @param dest 读取结果存储路径
     */
    public static void handle(String src, String dest) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            //源文件
            File srcFile = new File(src);
            //写出文件
            File destFile = new File(dest);
            FileReader fr = new FileReader(srcFile);
            FileWriter fw = new FileWriter(destFile);

            br = new BufferedReader(fr);

            bw = new BufferedWriter(fw);
            String str;
            while ((str = br.readLine()) != null) {
                //判断当前行是否以.method开始
                boolean flag = str.startsWith(".method");
                if (flag) {
                    //是以.method开始
                    //提取API
                    bw.write(str + "\n");
                    bw.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
}
