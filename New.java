public class New{
    public static String capitalize(String word){
        String firstLetter = word.substring(0,1).toUpperCase();
        String rest = word.substring(1).toLowerCase();
        String message = firstLetter + rest;

        return message;
    }
    public static void main(String[] args) {
        String mainMessage = capitalize("aSILXAN");
        System.out.println(mainMessage);
    }
}