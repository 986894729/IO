package com.bxm.io;

import org.junit.Rule;
import org.junit.Test;

import java.io.*;
import java.util.Random;

/**
 * @FileName com.bxm.io.Demo01.java
 * @CopyRright (c) 2017-bxm：杭州微财科技有限公司
 * @Creator 秦甘泉
 * @Created 2017-10-19 10:46:00
 * @Modifier 秦甘泉
 * @Updated 2017-10-19 10:46:00
 * @Description
 * @Version BUILD1001
 */
public class Demo01 extends Thread{

    @Test
    public void test1(){
        File file = new File("D:\\qin\\test\\test.iml");
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println("文件的字节数:"+file.length());

        File file1 = new File("D:\\qin\\bxm\\test");
        try {
            String[] subNames = file1.list();
            File[] files = file1.listFiles();

            for (String name:subNames) {
                System.out.println(name);
            }

            for (File fileItem:files) {
                System.out.println(fileItem.getAbsolutePath());
            }

            System.out.println("成功");
        } catch (Exception e) {
            System.out.println("失败");
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        digui(new File[]{new File("D:\\qin\\bxm\\test") });
    }

    public static void digui(File[] files){

        for (File file:files) {
            System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                digui(file.listFiles());
            }
        }
    }

    @Override
    public void run(){
        //File[] files = {new File("D:\\qin\\bxm\\test")};
        //digui(files);
        for (int i=0;i<1000;i++) {
            System.out.println(i);
        }
    }
    @Test
    public void test3(){
        File[] files = File.listRoots();
        for (File file:files) {
            System.out.println(file.toString());
        }
    }

    /**
     * 1、建立联系
     * 2、选择流
     * 3、操作:数组大小，read
     * 4、释放资源
     */
    @Test
    public void test4(){
        File file = new File("D:\\study\\test.txt");

        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] bytes = new byte[10];
            int len = 0;

            while (-1!=(len=is.read(bytes))){
                String info = new String(bytes,0,len);
                System.out.println(info);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("关闭资源失败");
                }
            }
        }
    }
    /**
     * 1、建立联系
     * 2、选择流
     * 3、操作:数组大小，write
     * 4、释放资源
     */
    @Test
    public void test5(){
        File file = new File("D:/study/heheda.txt");

        OutputStream os = null;
        try {
            os = new FileOutputStream(file,false);

            String info = "quange zuishuai";

            byte[] bytes = info.getBytes();
            os.write(bytes,0,bytes.length);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("输出流关闭失败");
                }
            }
        }
    }

    /**
     * 测试读取某一个文件夹的文件，写入到另一个文件夹里面
     */
    @Test
    public void test6(){
        File readFile = new File("D:/study/test.txt");
        File writeFile = new File("D:/study/writeTest/lalala.txt");
        try {
            copyFile(readFile,writeFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void copyFile(File readFile,File writeFile) throws IOException {
        //读取
        //1、建立联系

        //2、选择流
        InputStream is = null;
        OutputStream os = null;
            is = new FileInputStream(readFile);
            //3、操作
            //选择数组大小
            byte[] bytes = new byte[10];
            //实际大小
            int len = 0;
            String info = "";
            while(-1!=(len=is.read(bytes))){
                info += new String(bytes,0,len,"ISO-8859-1");
            }

            //输出流
            //1、建立联系

            //2、选择流
            os = new FileOutputStream(writeFile,false);

            byte[] writeBytes = info.getBytes("ISO-8859-1");

            os.write(writeBytes,0,writeBytes.length);
            os.flush();
            if (null!=os){
                os.close();
            }
            if (null!=is){
                is.close();
            }

    }

    @Test
    public void test7(){
        testType(1);
        testType("");
        try {
            testType(new FileOutputStream("D:/study/test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void testType(Integer age){
        System.out.println("我的参数是整形");
    }

    public void testType(String name){
        System.out.println("我的参数是字符串");
    }
    public void testType(Object what){
        System.out.println("我是所有对象");
    }


    @Test
    public void whoOverTime(){

        Random random = new Random();
        for (int i=0;i<10;i++) {
            int num = random.nextInt(3);
            System.out.println(num==0?"吴昊":(num==1?"秦甘泉":"孙仲书"));
        }
    }

    @Test
    public void test8(){
        //D:\qin\bxm\item
        String srcPath = "D:/qin/bxm/item";
        String destPath = "D:/test/dir";
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        if (srcFile.isDirectory()){//文件夹
            destFile = new File(destFile,srcFile.getName());
        }
        copyDirDetial(srcFile,destFile);
    }

    private void copyDirDetial(File srcFile,File destFile) {
        if (srcFile.isFile()){//文件
            try {
                copyFile(srcFile,destFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (srcFile.isDirectory()){//文件夹或目录
            //确保目标文件夹存在
            destFile.mkdir();
            //获取下一级目录|文件
            for (File file:srcFile.listFiles()) {
                copyDirDetial(file,new File(destFile,file.getName()));
            }
        }
    }


}
