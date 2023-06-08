import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args){
        System.out.println("enter number 1");
        Scanner obj=new Scanner(System.in);
        float num1=obj.nextFloat();
        System.out.println("enter number 2");
        float num2=obj.nextFloat();
        System.out.println("enter number 3");
        float num3=obj.nextFloat();
        float sum=num1+num2+num3;
        System.out.println("sum is " + sum);
    }
}