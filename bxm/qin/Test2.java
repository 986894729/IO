package com.bxm.qin;

/**
 * Created by ganquan on 2017/8/4.
 */
public class Test2 {

    private static final Test2 test2=null;

    private Test2(){

    }
    @TestAnnotation
    public static Test2 getInstance(){
        if (test2!=null){
            return test2;
        }
        return new Test2();
    }



}
