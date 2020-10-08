package PS03;

public class WaveNumbers40 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 1) {
            System.out.println("----------------------------------------");
          int k = 0;
          while (k < 10){
              System.out.print("_-^-");
              k++;
          }
            System.out.println();
          int m = 1;
          while (m <= 20){
              int j = 0;
              while (j < 2) {
                  System.out.print(m % 10);
                  j++;
              }
              m++;
          }
            System.out.println();
            System.out.println("----------------------------------------");
            i++;
        }
    }
}
