class Base1{
    Base1(){
        System.out.println("this is base class constructor");
    }
    Base1(int a){
        System.out.println("this is base class constructor with value of a as:" + a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(3);
        System.out.println("this is derived class constructor");
    }
    Derived1(int b){
        System.out.println("this is derived class constructor with value of b as:" + b);
    }

}
public class Inheritance3{
    public static void main(String[] args) {
       Base1 b=new Base1();
       Derived1 d=new Derived1(10);
    }

}