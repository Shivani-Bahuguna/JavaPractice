import java.util.Scanner;

public class SumOfMultiplicationTable{
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(num*i);
        }
        System.out.println(sum);
    }
}