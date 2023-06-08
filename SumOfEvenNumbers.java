import java.util.Scanner;

public class SumOfEvenNumbers{
    public static void main(String[] args){
        System.out.println("enter how many even numbers' sum do you want");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(2*i);
        }
        System.out.println("sum is:" + sum);
    }
}