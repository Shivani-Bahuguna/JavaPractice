interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Bicycle1{
    void bicyclemethod();
}
class Hello{
    void hellomethod(){
        System.out.println("hello");
    }
}
class AvonCycle extends Hello implements Bicycle,Bicycle1  {
    int speed=7;

   public  void applyBrake(int decrement){
        speed=speed-decrement;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public void bicyclemethod(){
        System.out.println("this is bicyclemethod");
    }
}
public class Interface{
    public static void main(String[] args) {
       // Bicycle b1=new Bicycle();  invalid
       Bicycle b=new AvonCycle() ;  //valid
       AvonCycle a=new AvonCycle();  //valid
        a.hellomethod();
       //AvonCycle a1=new Bicycle();  invalid

    }
}