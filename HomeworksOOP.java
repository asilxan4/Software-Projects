class Person {
    String name;
    int age;
    
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    void greet(){
        System.out.println("Hello I'm "+name + "," + age + " years old!");
    }
}

public class HomeworksOOP{
    public static void main(String[] args) {
        Person person1 = new Person("Asilxan", 21);
        person1.greet();

        Person[] people = new Person[3];

        people[0] = new Person("Asilxan", 21);
        people[1] = new Person("Surface", 12);
        people[2] = new Person("Vali", 13);

        for (Person p : people){
            p.greet();
        }
    }
}