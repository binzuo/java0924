package zuobin;

/**
 * Created by Administrator on 2016/9/24.
 */
public final class FinalClassTest {
    private final int x;
    public final void method(){

    }
    public  FinalClassTest(){
        x=1;

    }

    public static void main(String[] args) {
        FinalClassTest finalClassTest=new FinalClassTest();
        //finalClassTest.x=1;
    }
}
//public class FinalClass extends FinalClassTest{//终态的类不能再被子类化。

//}
//class FinalClass extends FinalClassTest{
   // public final void method(){//终态的方法不能在子类中被重写

    //}

//}
