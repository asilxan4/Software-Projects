class Animal{
    void makeSound(){
        System.out.println("Some sound");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Mewo");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Woof");
    }
}

public class Polimorfizm{
    public static void main(String[] args) {
        Animal animal1 = new Cat("Barsik");
        Animal animal2 = new Dog("Rex");

        animal1.makeSound();
        animal2.makeSound();
    }
}