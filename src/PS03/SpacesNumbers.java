package PS03;

public class SpacesNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int k = i;
            while (k != 0) {
                System.out.print(" ");
                k--;
            }
            System.out.println( i + 1 );
            i++;
        }
    }

    public static void withFoorLoop() {
        for (int i = 0; i < 5; i++) {
            for (int k = i; k != 0; k--) {
                System.out.print(" ");
            }
            System.out.println( i + 1 );
        }
    }
}
