import java.util.Scanner;


public class Test{
    public int age=30;
    public String role;
    public void getRole(){
        System.out.println("enter your role");
        Scanner obj=new Scanner(System.in);
        role=obj.nextLine();
    }
    public void showRole(){
        System.out.println(role);
    }
    public static void main(String[] args){
        Test s=new Test();
        System.out.println(s.age);
        s.getRole();
        s.showRole();
    }
}
