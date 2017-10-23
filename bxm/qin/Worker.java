package com.bxm.qin;

import org.junit.Test;

/**
 * @FileName com.bxm.qin.Worker.java
 * @CopyRright (c) 2017-bxm：杭州微财科技有限公司
 * @Creator 秦甘泉
 * @Created 2017-10-18 09:34:00
 * @Modifier 秦甘泉
 * @Updated 2017-10-18 09:34:00
 * @Description
 * @Version BUILD1001
 */
public class Worker implements Runnable {

    @Test
    public void test(){

        run();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            queryData(i);
        }
    }

    MapTest queryData(Integer i){

        System.out.println(i);
        return new MapTest();
    }

}
