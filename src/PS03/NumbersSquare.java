package PS03;

public class NumbersSquare {
    public static void main(String args[]) {

        int i = 1;
        while (i <= 4) {
            int k = 1;
            while (k <= 5) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void withForLoop() {
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
