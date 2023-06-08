import java.util.Scanner;

public class IfElsePractice{
    public static void main(String[] args){
        System.out.println("enter total marks");
        Scanner obj=new Scanner(System.in);
        float totalmarks=obj.nextInt();
        System.out.println("enter marks of subject1");
        float subject1=obj.nextFloat();

        System.out.println("enter marks of subject2");
        float subject2=obj.nextFloat();
        System.out.println("enter marks of subject3");
        float subject3= obj.nextFloat();
        float percentage=((subject1+subject2+subject3)/totalmarks)*100;
        if (percentage>=40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}