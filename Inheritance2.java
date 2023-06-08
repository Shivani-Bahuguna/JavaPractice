class Base{
    public Base(){
        System.out.println("this is base class constructor");
    }
}
class Derived extends Base{
    public Derived(){
        System.out.println("this is derived class constructor");
    }
}
public class Inheritance2{
    public static void main(String[] args) {
        Base b=new Base();
        Derived d=new Derived();
    }
}