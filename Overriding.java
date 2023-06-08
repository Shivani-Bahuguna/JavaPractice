class A{
    void meth1(){
        System.out.println("meh1 of class A");
    }
}
class B extends A{
    void meth2(){
        System.out.println("meth2 of class B");
    }
    void meth1(){
        System.out.println("meth1 of class B");
    }
}
public class Overriding{
    public static void main(String[] args) {
        B b=new B();
        b.meth1();
        b.meth2();
    }

}