package com.bxm.qin;

import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @FileName com.bxm.qin.MapTest.java
 * @CopyRright (c) 2017-bxm：杭州微财科技有限公司
 * @Creator 秦甘泉
 * @Created 2017-09-23 11:05:00
 * @Modifier 秦甘泉
 * @Updated 2017-09-23 11:05:00
 * @Description
 * @Version BUILD1001
 */
public class MapTest {

    private Long num;

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return num;
    }

    @Test
    public void test1(){

        /*Map<Long,Object> map = new HashMap<>();

        Long a = 10000L;
        Long b = 60000L;
        setNum(b);
        map.put(a,1);
        map.put(2L,2);
        map.put(3L,3);
        map.put(4L,4);
        map.put(0L,5);
        map.put(getNum(),6);

        System.out.println(map.get(b));*/

        /*BigDecimal d1 = new BigDecimal("0.00");
        BigDecimal d2 = new BigDecimal("0.01");
        int i = d2.compareTo(d2);
        d2.toString();
        System.out.println();*/

        ///Integer a = 11;

        //String url = "aaaaaaa";
        //System.out.println(ChangeToMd5.getMD5(String.valueOf(1568004)));

        //String url = "http://m.jiekuanzhuanjia.com/register/login10?channel=lqudao402bxm0606xs";
        //System.out.println(url.indexOf("?"));

       /* Float of = Float.valueOf(new BigDecimal("0.3")+"") * 100;
        String  url = "http://www.jnwabco.com.cn/item/cdb?gzid=dd-bxm-zy-cdb99-002-sb";
        url = (url.indexOf("?")==-1)?(url+"?bxm_id="+111111):(url+"&bxm_id="+1111111);
        //System.out.println(of.intValue()>30);
        System.out.println(url);*/


   /*    List<String> list = new ArrayList<>();

        for (String str:list) {
            list.get(2);
        }*/

        /*BigDecimal bigDecimal = new BigDecimal("0.11");
        BigDecimal bigDecimal1 = new BigDecimal("0.12");
        BigDecimal divide = bigDecimal.subtract(bigDecimal1);
        BigDecimal add = bigDecimal.add(bigDecimal1);

        System.out.println(divide.compareTo(new BigDecimal("0.00")));
        System.out.println(add);*/
        //Date date = new Date("111");
       /* DateFormat sdf = new SimpleDateFormat("yyyy-MM-hh dd:mm:ss");
        try {
            Date parse = sdf.parse("2017-05-05 12:10:11");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        //System.out.println(date);
      /* MapTest mapTest2 = new MapTest();

       List<MapTest> list1 = new ArrayList<>();
       MapTest mapTest = new MapTest();
       mapTest.setAge(15);
       mapTest.setNum(50L);
       list1.add(mapTest);
        mapTest2.setList(list1);
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i).setAge(17);
        }

        System.out.println(mapTest2.getList().get(0).getAge());*/

        /*List<MapTest> list = new ArrayList<>();
        list.addAll(null);
        System.out.println(list.size());*/


        /*BigDecimal a1 = new BigDecimal("0.00");
        BigDecimal a2 = new BigDecimal("0.01");
        int i = a2.compareTo(a1);
        System.out.println(i);*/






    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private List<MapTest> list;

    public List<MapTest> getList() {
        return list;
    }

    public void setList(List<MapTest> list) {
        this.list = list;
    }
}
