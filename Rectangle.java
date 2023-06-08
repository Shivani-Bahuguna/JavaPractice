import java.util.Scanner;

class RectangleClass{
    float l,b;
    void setDimensions(float length,float breadth){
        l=length;
        b=breadth;
    }
    float perimeter(){
        return 2*(l+b);
    }
    float area(){
        return l*b;
    }

}
public class Rectangle{
    public static void main(String[] args) {
        System.out.println("enter the length:");
        Scanner obj=new Scanner(System.in);
        float length=obj.nextFloat();
        System.out.println("enter the breadth");
        float breadth=obj.nextFloat();
        RectangleClass rectangle=new RectangleClass();
        rectangle.setDimensions(length,breadth);
        System.out.println("perimeter : "+rectangle.perimeter());
        System.out.println("area : "+rectangle.area());

    }
}