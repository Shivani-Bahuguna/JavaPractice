import java.util.Scanner;

public class FibonaciSeries{
    int fibonaci(int num){
        if(num==1){
            return 0;
        }
        else if(num==2){
            return 1;
        }
        else{
            return fibonaci(num-1)+fibonaci(num-2);
        }
    }
    public static void main(String[] args){
        System.out.println("enter which term do you want to see");
        Scanner obj=new Scanner(System.in);
        int term=obj.nextInt();
        FibonaciSeries f=new FibonaciSeries();
        System.out.println(f.fibonaci(term));
    }
}