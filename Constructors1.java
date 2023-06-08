class Constructors1Class{
    int id;
    String name;
    public Constructors1Class(){
        id=1;
        name="shivani";
    }
    public void showDetails(){
        System.out.println("id is:"+id);
        System.out.println("name is:" + name);
    }
}
public class Constructors1{
    public static void main(String[] args) {
        Constructors1Class c=new Constructors1Class();
        c.showDetails();
    }
}