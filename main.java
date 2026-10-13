import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // System.out.println("Hello, Java!");
        // int age = 12;
        // String name = "Asilxan";
        // double price = 1.55;
        // boolean isHappy = true;
        // System.out.println("Name:"+name);
        // System.out.println("Age:"+age);
        // System.out.println("Price:"+price);
        // System.out.println("true or fasle?" + isHappy);
        // System.out.println(7/2.0);


        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.println("Hello," + name + "You are" + age + "years old");

        // HomeWork ------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number! ");
        int firstNum = input.nextInt(); 

        System.out.print("Enter the second number! ");
        double secondNum = input.nextDouble();

        // Operation Here!
        System.out.println("Plus: " + (firstNum + secondNum));
        System.out.println("Minus:" + (firstNum - secondNum));
        System.out.println("Umnojenya: " + (firstNum * secondNum));
        System.out.println("Razdlenya: "+ (firstNum / secondNum));
        System.out.println("Ostatok: " + (firstNum % secondNum));

    }
}