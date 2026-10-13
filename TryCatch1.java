public class TryCatch1{
    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("You cannot devide by 0!");
        }
    }
}