package PS03;//package PS03;

public class NumbersTriangle {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 7) {
            int k = 1;
            while (k <= i) {
                System.out.print(i);
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void withFoorLoop() {
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= i; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
