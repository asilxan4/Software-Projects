class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    void greet(){
        System.out.println("Hello I'm "+ name + " and I'm "+ age + " years old");
    }
}

class Students extends Person{
    String group;

    Students(String name, int age , String group){
        super(name, age);// super eto vizov kotstruktora ot person!
        this.group = group;
    }
}


public class Inheritence{
    public static void main(String[] args) {
        Students student1 = new Students("Asilxan", 21, "Java(Software Engineering)");
        student1.greet();
        System.out.println(student1.group);
    }
}