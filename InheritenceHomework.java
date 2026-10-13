class Animal{
    String name;

    public void makeSound(){
        System.out.println("Some Sound");
    }

    public Animal(String name) {
        this.name = name;
    }
    
}
class Cat extends Animal{

    Cat(String name) {
        super(name);
    }


    @Override
    public void makeSound(){
        System.out.println("mewo");
    }
}
class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}

public class InheritenceHomework{
    public static void main(String[] args) {
        Animal animal1 = new Cat("Barsik");
        Animal animal2 = new Dog("Rex");

        animal1.makeSound();
        animal2.makeSound();
    }
}