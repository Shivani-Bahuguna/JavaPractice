import java.sql.SQLOutput;
import java.util.Scanner;

public class Percentage{
    public static void main(String[] args){
        System.out.println("enter total marks");
        Scanner obj=new Scanner(System.in);
        float totalmarks=obj.nextFloat();
        System.out.println("enter marks of subject1");
        float subject1=obj.nextFloat();
        System.out.println("enter marks of subject2");
        float subject2=obj.nextFloat();
        System.out.println("enter marks of subject3");
        float subject3=obj.nextFloat();
        System.out.println("enter marks of subject4");
        float subject4=obj.nextFloat();
        System.out.println("enter marks of subject5");
        float subject5=obj.nextFloat();
        float percentage=((subject1+subject2+subject3+subject4+subject5)/totalmarks)*100;
        System.out.println(percentage + "%");

    }
}