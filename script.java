import java.util.Scanner;

public class script {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // твой код здесь
        System.out.print("Enter number 1: ");
        int firstNumber = scanner.nextInt();

        
        System.out.print("Enter +\n-\n*\n/\n");
        String move = scanner.next();


        System.out.print("Enter number 2: ");
        int secondNumber = scanner.nextInt();


        if (move .equals("+")){
            System.out.println(firstNumber + secondNumber);
        }else if (move .equals("-")) {
            System.out.println(firstNumber - secondNumber);
        }else if (move .equals("*")){
            System.out.println(firstNumber * secondNumber);
        }else if (move .equals("/")){
            if (secondNumber != 0){
                System.out.println(firstNumber / secondNumber);
            }else{
                System.out.println("ZeroDivisionError");
            }
        }else {
            System.out.println("You should enter on of the moves!!!");
        }

    }
}