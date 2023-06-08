import java.util.Scanner;

class SquareClass{
    float s;
    void setSide(float side){
        s=side;
    }
    float perimeter(){
        return 4*s;
    }
    float area(){
        return s*s;
    }

}

public class Square{
    public static void main(String[] args){
        System.out.println("enter the side of the square");
        Scanner obj=new Scanner(System.in);
        float s=obj.nextFloat();
        SquareClass square=new SquareClass();
        square.setSide(s);
        System.out.println("perimeter : " +square.perimeter());
        System.out.println("area : "+square.area());

    }
}