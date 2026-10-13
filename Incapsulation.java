class User{
    private String name;
    private int age;

    public User(String name,int age){
        this.name = name;
        setAge(age);
    }

    public int getAge(){      //Method Getter chtob prochitat !
        return age;
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }else{
            System.out.println("Age connot be negative!");
        }
    }
}

public class Incapsulation{
    public static void main(String[] args) {
        User user1 = new User("Asilxan",21);
        System.out.println(user1.getAge());

        user1.setAge(25);
        System.out.println(user1.getAge());

        user1.setAge(-21);
    }
}