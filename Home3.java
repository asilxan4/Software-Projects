import java.util.HashMap;

public class Home3{
    public static void main(String[] args) {
        HashMap<String,Integer> user = new HashMap<>();

        user.put("Name1", 20);
        user.put("Name2", 21);
        user.put("Name3", 22);

        System.out.println(user);

        for (String name : user.keySet()) {
            System.out.println(name + ":" + user.get(name));
        }
    }
}