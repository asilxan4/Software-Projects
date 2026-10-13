import java.util.Scanner;
public class Count{

    @SuppressWarnings("empty-statement")
    public static int counting(String text){
        int sum = 0;


        for (int i = 0;i < text.length();i++){
            char letter = text.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the message");
        // String message = scanner.nextLine();
        int message = counting("Hello");
        System.out.println(message);

    }
}