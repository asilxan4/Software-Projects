import java.util.ArrayList;
import java.util.Scanner;

public class Home2{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Enter the 1st: ");
        String first = scanner.nextLine();


        System.out.println("Enter the 2nd: ");
        String secound = scanner.nextLine();


        System.out.println("Enter the 3rd: ");
        String third = scanner.nextLine();


        shoppingList.add(first);
        shoppingList.add(secound);
        shoppingList.add(third);

        System.out.println(shoppingList.size());

        for (String p_name : shoppingList ){
            System.out.println(p_name);
        }
    }
}