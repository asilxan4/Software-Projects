
public class Arrays2 {
    public static void main(String[] args) {
        int[] massive = {1,2,3,4,5};
        int sum = 0;
        int indexx = 0;
        int avg = 0;


        for (int i : massive) {
            sum += i;
        }System.out.println("Sum:" + sum);


        for (int index = 1;index < massive.length;index++) {
            indexx = index;
          }
          avg = sum/indexx;
          System.out.println("Avarage:" + avg);
    }
}