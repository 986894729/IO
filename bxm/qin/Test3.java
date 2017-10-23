package com.bxm.qin;

/**
 * Created by ganquan on 2017/8/10.
 */
public class Test3 {

    public static int b= 0;
    public static Test3 test3 = new Test3();
    public static int a;


    private Test3(){
        super();
        a++;
        b++;
    }

    public static Test3 getInstance(){
        return test3;
    }


    public static class MyTest{

        public static void main(String[] args) {

            Integer i = 25;
            System.out.println(i/10);


        }

    }




}
