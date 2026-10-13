import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // твой код здесь
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
        }
        for (int number : numbers){
            System.out.println(number);
        }
        }

    }
