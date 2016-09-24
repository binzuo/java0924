package zuobin;

import jdk.internal.dynalink.linker.LinkerServices;

/**
 * Created by Administrator on 2016/9/24.
 */
public interface InterfaceClassTest extends InterfaceClassTest1,InterfaceClassTest2,InterfaceClassTest3,InterfaceClassTest4 {
    int Ten=10;
    double D=3.14;
    void run();

    public static void main(String[] args) {
       // InterfaceClassTest interfaceClassTest=new InterfaceClassTest();
       // System.out.println("南无地藏菩萨摩诃萨");
    }
}
interface InterfaceClassTest1{
    void A();
}
interface InterfaceClassTest2{
    void B();
}
interface InterfaceClassTest3{
    void C();
}
interface InterfaceClassTest4{
    void D();
}
class Te implements InterfaceClassTest{

    @Override
    public void run() {

    }

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

    @Override
    public void C() {

    }

    @Override
    public void D() {

    }
}




