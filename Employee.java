class EmployeeClass{
    int id;
    String name;
    void printDetails(){
        System.out.println("the id is "+id);
        System.out.println("the name is "+name);
    }
}
public class Employee{
    public static void main(String[] args){
     EmployeeClass e=new EmployeeClass();
     e.id=1;
     e.name="shivani";
     e.printDetails();
    }
}