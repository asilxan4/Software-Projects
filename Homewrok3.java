class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    boolean isAdult(){
        if (age >= 18){
            return true;
        }else{
            return false;
        }
    }
}

public class Homewrok3{
    public static void main(String[] args) {
        Person person1 = new Person("Asilxan", 21);
        System.out.println(person1.isAdult());

        Person person2 = new Person("Adina", 13);
        System.out.println(person2.isAdult());

    }
}