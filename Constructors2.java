import java.util.Scanner;

class Constructors2Class{
    int id;
    String name;
    public Constructors2Class(int i, String s){
        id=i;
        name=s;
    }
    void getDetails(){
        System.out.println("id is "+id);
        System.out.println("name is "+name);
    }
}
public class Constructors2 {
    public static void main(String[] args) {
        System.out.println("enter your id:");
        Scanner obj=new Scanner(System.in);
        int id=obj.nextInt();
        System.out.println("enter your name:");
        Scanner obj1=new Scanner(System.in);
        String name=obj1.nextLine();
        Constructors2Class c=new Constructors2Class(id,name);
        c.getDetails();
    }
}