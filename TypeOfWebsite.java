import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        System.out.println("enter the website name");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        if (name.endsWith(".com")) {
            System.out.println("commercial website");
        }
        else if (name.endsWith(".org")) {
            System.out.println("organisation website");
        }
        else if(name.endsWith(".in")){
            System.out.println("indian website");
        }
    }
}