import java.util.HashMap;

public class Hashmap2{
    public static void main(String[] args) {
        HashMap<String,Integer> user = new HashMap<>();

        user.put("Asilxan", 12);//Dobavit 
        user.put("Salom", 13);

        System.out.println(user.get("Asilxan"));//poluchit
        System.out.println(user.containsKey("Asilxan"));//est li ?
        System.out.println(user.size());//razmer

        user.remove("Salom");
        user.put("Asilxan", 21);
        System.out.println(user);

        for (String i : user.keySet()) {//tolka key beret!
            System.out.println(i);
        }

        for (var entry : user.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}