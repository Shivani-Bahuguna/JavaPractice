import java.util.Scanner;

public class IncomeTaxCalculation{
    public static void main(String[] args){
        System.out.println("enter your income");
        Scanner obj=new Scanner(System.in);
        float income=obj.nextFloat();
        float tax=0f;
        if(income<250000){
            System.out.println("no income tax ");
            System.out.println("tax= " + tax);
        }
        else if (income>=250000 && income<500000) {
            System.out.println("5% income tax");
            tax=0.05f*income;
            System.out.println("tax= " + tax);
        }
        else if(income>=500000 && income<1000000){
            System.out.println("20% income tax");
            tax=0.2f*income;
            System.out.println("tax= " + tax);
        }
        else{
            System.out.println("30% income tax");
            tax=0.3f*income;
            System.out.println("tax= " + tax);
        }
    }
}