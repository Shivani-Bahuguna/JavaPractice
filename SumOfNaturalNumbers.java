import java.util.Scanner;

public class SumOfNaturalNumbers{
    int sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("how many numbers' sum do you want to print");
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        SumOfNaturalNumbers s=new SumOfNaturalNumbers();
        System.out.println(s.sum(number));
    }
}