import java.util.HashMap;
import java.util.Scanner;
public class Home4{
    public static void main(String[] args) {
        HashMap <String,Integer> user = new HashMap<>();
        
        user.put("Man1", 12);
        user.put("Man2", 13);
        user.put("Man3", 14);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name! ");
        String name = scanner.nextLine();


    
        if (user.containsKey(name)){
            System.out.println(name + ":" + user.get(name));
        }else{
            System.out.println("NotFound!");
        }
    }
}