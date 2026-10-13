import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Vali");
        names.add("Sardor");

        System.out.println(names);
        System.out.println(names.size());//Chtob uvidet dlinu
        System.out.println(names.get(1));//chtob poluchat immeno po indexu

        names.remove(0);
        System.out.println(names);

        names.remove("Vali");
        System.out.println(names);

        names.set(0, "Asilxan");//Izmenit znahcenya po indexu
        System.out.println(names);
        System.out.println(names.contains("Asilxan"));//Est li takoe ?


    }
}