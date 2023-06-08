class Animal{
    void getAnimal(){
        System.out.println("i am an animal");
    }
}
class Dog extends Animal{
    void getDog(){
        System.out.println("i am a dog");
    }
}
class Cat extends Animal{
    void getCat(){
        System.out.println("i am a cat");
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.getAnimal();
        Dog d=new Dog();
        d.getAnimal();
        d.getDog();
        Cat c=new Cat();
        c.getAnimal();
        c.getCat();

    }
}