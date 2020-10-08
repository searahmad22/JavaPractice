package PS03;

public class NumbersOutput60 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            System.out.print("         |");

            i++;

        }

        System.out.println();

        int j = 0;
        while (j < 6) {
            int k = 1;
            while (k <= 10) {
                System.out.print(k % 10);
                k++;
            }
            j++;
        }
    }

}
