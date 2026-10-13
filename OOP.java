class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
        }
    void greet(){
        System.out.println("Hi I'm "+ name);

        
    }
}

public class OOP{
    public static void main(String[] args){
        // Person person1 = new Person();
        // person1.name = "Asilxan";
        // person1.age = 21;

        //person1.greet();// Eto obyekt

        Person person1 = new Person("Asilxan", 21);
        person1.greet();


    }
}