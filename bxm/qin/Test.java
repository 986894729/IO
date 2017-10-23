package com.bxm.qin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ganquan on 2017/8/1.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date dBefore = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String yesterday = sdf.format(dBefore);
        System.out.println(yesterday);
    }

    @Override
    public String toString(){

        return null;
    }

}
