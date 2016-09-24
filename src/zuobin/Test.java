package zuobin;

import java.util.logging.XMLFormatter;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Test {
    //private int x;
    //private  double y;
    public void method(){
        int z=10;
        System.out.println(z);
       // int z=10;
        for (x=1;x<10;x++){
            System.out.println(x);

        }


    }
    public void method1(){
       double y=10.30;
        System.out.println(this.y);

    }
    private int x;
    private  double y;

   // public Test(int x, double y) {
       // this.x = x;
        //this.y = y;
    //}

    public static void main(String[] args) {
        Test test=new Test();
        //test.method1();
        System.out.println(test.y);



    }
}
