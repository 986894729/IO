package com.bxm.io;

import org.junit.Test;

import java.io.File;

/**
 * @FileName com.bxm.io.File1.java
 * @CopyRright (c) 2017-bxm：杭州微财科技有限公司
 * @Creator 秦甘泉
 * @Created 2017-10-19 10:03:00
 * @Modifier 秦甘泉
 * @Updated 2017-10-19 10:03:00
 * @Description
 * @Version BUILD1001
 */
public class File1 {

    @Test
    public void test(){

        //路径分隔符
        System.out.println(File.pathSeparator);

        //文件分隔符
        System.out.println(File.separator);

        //D:\qin\mysql数据表和数据sql脚本
        //String parentPath = "D:\\qin\\mysql数据表和数据sql脚本";
        String parentPath = "D"+File.pathSeparator+File.separator+"qin"+File.separator+"mysql数据表和数据sql脚本"+File.separator;
        String name = "test.txt";

        // parent 抽象路径名和 child 路径名字符串
        File file = new File(parentPath,name);

        System.out.println(file.getName());
        System.out.println(file.getPath());

        File file1 = new File(new File(parentPath),name);
        System.out.println(file1.getPath());

        File file2 = new File(parentPath+name);

        System.out.println(file2.getPath());

        //没有盘符
        File file3 = new File("test.txt");
        System.out.println(file3.getPath());
        System.out.println(file3.getAbsolutePath());



    }

}
