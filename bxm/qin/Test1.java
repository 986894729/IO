package bxm.qin;

/**
 * Created by ganquan on 2017/8/3.
 */
@TestAnnotation
public class Test1 implements Cloneable{

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {

       /* List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        Integer pageNum = 1;
        Integer pageSize = 5;
        list = list.subList(0,3);

        for (String str:list) {
            System.out.println(str);
        }*/

        //System.out.println(3%5);
        Integer a = 0;
        System.out.println(a.compareTo(1));


        System.out.println(Test2.getInstance());

        try {
            Class testClass = Test.class;
            System.out.println(testClass.getPackage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
