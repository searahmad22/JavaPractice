package PS04;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = input.nextInt();;

        if (num >= 0) {
            System.out.println("X    X!");
            for (int i = 0; i < num + 1; i++) {
                System.out.println(i + "    " + factorialOfN(i));
            }
        }else {
            System.out.println("Incorrect input!");
        }

    }

    private static long factorialOfN(int n) {
        long factorial = 1;

        if (n == 0) {
            return factorial;
        }else {

            for (int i = 0; i < n; i++) {
                factorial *= (i+1);
            }
        }
        return factorial;
    }
}
