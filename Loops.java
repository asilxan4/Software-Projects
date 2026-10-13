
import java.util.Scanner;


public class Loops{
    public static void main(String[] args) {
        // Code starts from here!

        // For loop is here! ---------------------------
        // for (int i = 1;i <= 10;i++) {
        //     System.out.println(i);
        // }
        

        // While loop is here!-----------------------------
        // int number = 1;
        // while (number<=10){
        //     System.out.println(number);
        //     number++;
        // }


        // Project starts from here!
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number! ");
        // int number1 = scanner.nextInt();
        // int sum = 0;

        // Solved ---------------------------------
        // if (number1 < 0){
        //     System.out.println("Wrong one!");
        // }else if (number1 > 0){
        //     for (int i = 0;i <=number1;i++) {
        //         sum +=i;
        //     }System.out.println(sum);
        // }


        // Table
        // for (int i = 1;i<=10;i++){
        //     System.out.println(number1 + "*" + i + "=" + (number1*i));
        // }


        // checkPoint
        int password = 1234;
        boolean granted = false;

        for (int attempt = 1; attempt <=3;attempt++) {
            System.out.print("Enter the password! ");
            int check = scanner.nextInt();

            if (check == password){
                System.out.println("True!");
                granted = true;
                break;
            }
            System.out.println("Wrong password. Attempts left: "+ (3 - attempt));
        }
        if (!granted){
            System.out.println("False!");
        }
    }
}