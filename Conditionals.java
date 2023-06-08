import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args){
        //if-else statement
        System.out.println("enter your age");
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if(age<18){
            System.out.println("child");
        }
        else if(age>=18 && age<60){
            System.out.println("adult");
        }
        else{
            System.out.println("senior citizen");
        }

        //switch statements
        switch(age){
            case 18:
                System.out.println("you can drive");
                break;
            case 60:
                System.out.println("you are old");
                break;
        }
    }
}