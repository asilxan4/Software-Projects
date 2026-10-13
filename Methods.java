
public class Methods {
    public static void main(String[] args) {
        // int  result = add(4, 3);
        // System.out.println(result);
        // greet("Ali");
        String message = "Hello, Java!";

        System.out.println(message.length());//Dlina 
        System.out.println(message.toUpperCase());//Big letters
        System.out.println(message.toLowerCase());//small letters
        System.out.println(message.charAt(4));//index of word
        System.out.println(message.charAt(2));//index of word
        System.out.println(message.charAt(3));//index of word
        System.out.println(message.contains("Java!"));//Is Java! in message?
        System.out.println(message.indexOf("Java"));//Which index it starts?
        System.out.println(message.replace("Java","JavaWorld" ));//replacing java!
        System.out.println(message.substring(5,10 ));//prints from 5 index to 10 index
        System.out.println(message.trim());//udalyaet probel po krayam!


        String csv = "Ali,Vali,Sardor";
        String[] names = csv.split(",");//Odnu stroku razbivaet na [] v tex ,estax gde vstrechaetsya ","
        System.out.println(names.length);
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static void greet(String name){
        System.out.println("Hello "+ name);
    }
}