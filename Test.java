
import java.util.Scanner;


public class Test{
    public static void main(String[] args) {
        //Code start from here!
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number");
        // int number = scanner.nextInt();

        // if (number > 0 ) {
        //    System.out.println("Positive!");
        // }else if (number < 0) {
        //     System.out.println("Negative!");
        // }else if (number == 0) {
        //     System.out.println("Zero!");
        // }
        

        // Second code start from here!
        // System.out.print("Enter your age! ");
        // int age = scanner.nextInt();

        // if (age <= 12 && age > 0){
        //     System.out.println("Child");
        // }else if (age >= 13 && age <= 17) {
        //     System.out.println("Teen");
        // }else if (age >= 18 && age <= 100) {
        //     System.out.println("Adult");
        // }

        // Third code start from here!
        String password = "VisualStudioCode";
        System.out.print("Enter the password: ");
        String checkPassword = scanner.nextLine();

        if (checkPassword .equals("VisualStudioCode")) {
            System.out.println("Access granted");
        }else{
            System.out.println("Wrong password");
        }
    }
}