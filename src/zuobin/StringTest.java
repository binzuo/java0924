package zuobin;

/**
 * Created by Administrator on 2016/9/24.
 */
public class StringTest {
    private String name;
    public static void test(String name){
        System.out.println("2:"+name);
        name="q";

        System.out.println("3:"+name);


    }

    public static void main(String[] args) {
        String name="zuobin";
        System.out.println("1:"+name);
        test(name);
        System.out.println("4:"+name);
    }
}
