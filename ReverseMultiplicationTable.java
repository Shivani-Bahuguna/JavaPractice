import java.util.Scanner;

public class ReverseMultiplicationTable{
    public static void main(String[] args){
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        for(int i=10;i>=1;i--){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}