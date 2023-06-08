import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("do you want to play the game. enter yes or no");
        Scanner obj=new Scanner(System.in);
        String play=obj.nextLine();
        int chance=1;
        while(play.equals("yes") && chance<=5){

            System.out.println("chance no. : "+chance);
            chance=chance+1;
            System.out.println("enter 1 for rock, 2 for paper and 3 for scissors");
            Scanner obj1=new Scanner(System.in);
            int userchoice=obj1.nextInt();
            Random r=new Random();
            int machinechoice=r.nextInt(1,4); //1 inclusive and 4 exclusive
            System.out.println(machinechoice);
            if (userchoice==1){
                if(machinechoice==1){
                    System.out.println("tie");
                }
                else if(machinechoice==2){
                    System.out.println("you lose");
                }
                else{
                    System.out.println("you win");
                }

            }
            else if(userchoice==2){
                if(machinechoice==1){
                    System.out.println("you win");
                }
                else if(machinechoice==2){
                    System.out.println("tie");
                }
                else{
                    System.out.println("you lose");
                }
            }
            else{
                if(machinechoice==1){
                    System.out.println("you lose");
                }
                else if(machinechoice==2){
                    System.out.println("you win");
                }
                else{
                    System.out.println("tie");
                }
            }
            System.out.println("do you want to play again.enter yes or no");
            play=obj.nextLine();

        }
        System.out.println("thankyou");
        if(chance==6){
            System.out.println("game over");
        }
    }
}