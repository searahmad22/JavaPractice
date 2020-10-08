package PS03;

public class NestedNumbers {
    public static void main(String args[]) {
        int j = 0;
        while (j < 3) {
            int i = 0;
            while (i < 10) {
                int k = 0;
                while (k < 3) {
                    System.out.print(i);
                    k++;
                }
                i++;
            }
            System.out.println();
            j++;
        }
    }

    public static void withFoorLoop() {
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 10; k++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
