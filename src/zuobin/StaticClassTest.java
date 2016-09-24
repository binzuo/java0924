package zuobin;


/**
 * Created by Administrator on 2016/9/24.
 */
public class StaticClassTest {
    private String name;
    private static int age;
    static void method(){
       // name="zuobin";
        age=21;
    }


    public static void main(String[] args) {
        StaticClassTest staticClassTest=new StaticClassTest();
        staticClassTest.name="zuobin";
        StaticClassTest.age=21;
        System.out.println(staticClassTest.name);
        System.out.println(StaticClassTest.age);
        StaticClassTest staticClassTest1=new StaticClassTest();
        staticClassTest1.name="binzuo";
        //staticClassTest1.age=20;
        System.out.println(staticClassTest1.name);
        System.out.println(StaticClassTest.age);

    }
}
