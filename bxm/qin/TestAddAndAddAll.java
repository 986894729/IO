package com.bxm.qin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName com.bxm.qin.TestAddAndAddAll.java
 * @CopyRright (c) 2017-bxm：杭州微财科技有限公司
 * @Creator 秦甘泉
 * @Created 2017-10-18 15:07:00
 * @Modifier 秦甘泉
 * @Updated 2017-10-18 15:07:00
 * @Description
 * @Version BUILD1001
 */
public class TestAddAndAddAll {


    @Test
    public void test(){

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2000000; i++) {
            list.add(i);
        }

        List<Integer> newList = new ArrayList<>();

        long time1 = System.currentTimeMillis();
        newList.addAll(list);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println("==============================");
        System.out.println(newList.size());
        List<Integer> newList1 = new ArrayList<>();
        long time3 = System.currentTimeMillis();
        for (Integer num:list) {
            newList1.add(num);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4-time3);
        System.out.println("==============================");
        System.out.println(newList1.size());
    }




}
