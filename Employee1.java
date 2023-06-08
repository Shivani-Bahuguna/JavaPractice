class Employee1Class{
    float salary;
    float getSalary(){
        return salary;
    }
    String name;
    void setName(){
        name="shivani";
    }
    String getName(){
        return name;
    }
}
public class Employee1{
    public static void main(String[] args){
    Employee1Class e=new Employee1Class();
    e.salary=900000000f;
        System.out.println(e.getSalary());
        e.setName();
        System.out.println(e.getName());
    }
}