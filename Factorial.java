import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        System.out.println("factorial using for loop");
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int factorial=1;
        //5*4*3*2*1
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

        System.out.println("factorial using while loop");
        int fact1=1;
        int i=1;
        while(i<=num){
            fact1=fact1*i;
            i=i+1;
        }
        System.out.println(fact1);

    }
}