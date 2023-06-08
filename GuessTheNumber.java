import java.util.Random;
import java.util.Scanner;

class Game{
    Random r=new Random();
    int machinenumber=r.nextInt(1,21);
    public Game(int usernumber){
        if(usernumber>machinenumber){
            System.out.println("your number is greater than the actual number");
        }
        else if(usernumber<machinenumber){
            System.out.println("your number is smaller than the actual number");
        }
        else{
            System.out.println("your number is equal to the actual number");
        }
    }

}
public class GuessTheNumber{
    public static void main(String[] args) {
        int chance=1;
        while(chance<=5){
            System.out.println("chance no. :"+chance);
            System.out.println("enter a number between 1 to 20");
            Scanner obj=new Scanner(System.in);
            int number=obj.nextInt();
            Game g=new Game(number);
            chance=chance+1;
        }

    }
}