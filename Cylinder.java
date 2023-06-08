import java.util.Scanner;

class CylinderClass{
    private float radius;
    private float height;
    void setDimensions(float r, float h){
        radius=r;
        height=h;
    }
    void getDetails(){
        System.out.println("volume is:"+ 3.14f*radius*height);
        System.out.println("surface area is:"+(2*3.14f+radius*height + 2*3.14f*radius*radius));
    }
}
public class Cylinder{
    public static void main(String[] args) {
        System.out.println("enter the radius of cylinder");
        Scanner obj=new Scanner(System.in);
        float radius= obj.nextFloat();
        System.out.println("enter the height of cylinder");
        float height= obj.nextFloat();
        CylinderClass c=new CylinderClass();
        c.setDimensions(radius,height);
        c.getDetails();

    }
}