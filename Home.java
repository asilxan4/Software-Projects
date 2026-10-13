
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        // Start here
        Scanner scanner = new Scanner(System.in);
        int[] massive = {1,2,3,4,5,6,7,8};

        // int max = massive[0];
        // int min = massive[0];

        // for (int number : massive) {
        //     if (number > max){
        //         max = number;
        //     }
        // }System.out.println("Max: " + max);

        // for (int number : massive) {
        //     if (number < min) {
        //         min = number;
        //     }
        // }System.out.println("Min: "+ min);
        System.out.print("Enter  the number! ");
        int number = scanner.nextInt();
        int numb = 0;

        boolean found = false;

        for (int i = 0;i<massive.length;i++) {
            if(massive[i] == number){
                System.out.println("Your number " + number + " is in massive");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Your number is not in the massive");
        }



        
    }
}