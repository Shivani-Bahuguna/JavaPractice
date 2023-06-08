abstract class Base2{
    abstract void method1();
    void method2(){
        System.out.println("this is method2");
    }
}
class Derived2 extends Base2{
    void method3(){
        System.out.println("this is method 3");
    }
    void method1(){
        System.out.println("this is method1");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        //Base2 b=new Base2();     this is invalid
        Base2 b=new Derived2();     //this is valid
        Derived2 d=new Derived2();   //this is valid
       // Derived2 d1=new Base2();    this is invalid
    }
}

//a single subclass cannot inherit multiple superclasses.
//a single subclass cannot inherit multiple abstract superclasses.