package com.bxm.qin;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 秦甘泉
 * @detail
 * @time 2017-08-28 10:53:00
 */
public class Test4 {

    private Integer password;
    private Integer username;

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public static void main(String[] args) {

 /*       String str = "0.05";

        if (str!=null&&!"".equals(str)){
            Float of = Float.valueOf(str)*100;
            System.out.println(of.intValue());
        }*/
        /*Random random = new Random();
        while (true){
            System.out.println(random.nextInt(2));
        }
        */

       /* Integer a = 154;
        Integer b = 354;
        Float v = Float.valueOf(a) / Float.valueOf(b);
        Float angle = v*360;
        System.out.println(angle.intValue());*/

       /*String str = "00";
        String[] split = str.split("-");
        System.out.println(split[0]);
*/

      /* String str = "";
        System.out.println(str.substring(0,0)+"00");*/

        /*List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.size());*/

       /* Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        Date parse = null;
        try {
            parse = sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);*/
       /*Test4 test4 = new Test4();

       if (test4.getPassword()!=null&&test4.getPassword()==1){

       }*/

      /* String  a = "6";
       String  b = "54";
       System.out.println(a.compareTo(b));*/

       /* BigDecimal bigDecimal = new BigDecimal(0.00);
        System.out.println(bigDecimal);*/
        /*Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date tem = cal.getTime();
        System.out.println(DateUtil.StringToDate(new SimpleDateFormat("yyyy-MM-dd").format(tem)));*/



    }
}
