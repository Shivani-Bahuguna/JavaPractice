import java.util.Scanner;

public class StringsPractice{
    public static void main(String[] args){
        //replacing one character with the other
        System.out.println("enter your name");
        Scanner obj=new Scanner(System.in);
        String yourname=obj.nextLine();
        String template="hello name. thankyou";
        template=template.replace("name",yourname);
        System.out.println(template);

        //detecting double and triple spaces
        String s="shivani  is a good girl.";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
    }
}