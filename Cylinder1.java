import java.util.Scanner;

class Cylinder1Class{
    float radius;
    float height;
    public Cylinder1Class(float r,float h){
        radius=r;
        height=h;
        System.out.println("volume is:"+ 3.14f*radius*height);
        System.out.println("surface area is:"+(2*3.14f+radius*height + 2*3.14f*radius*radius));
    }
}
public class Cylinder1{
    public static void main(String[] args) {
        System.out.println("enter the radius of the cylinder:");
        Scanner obj=new Scanner(System.in);
        float radius=obj.nextFloat();
        System.out.println("enter the height of the cylinder:");
        float height= obj.nextFloat();
        Cylinder1Class c=new Cylinder1Class(radius,height);
    }
}