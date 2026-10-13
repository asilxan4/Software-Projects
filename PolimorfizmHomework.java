class Animal{
    String name;

    void makeSound(){
        System.out.println("Some Sound");
    }

    public Animal() {
        this.name = name;
    }
    
}
class Cat extends Animal{


    @Override
    void makeSound(){
        System.out.println("mewo");
    }

    public Cat() {
        super();
    }

    
}
class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("woof");
    }
}


public class PolimorfizmHomework{
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik")}
    }
}