package PS04;

import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = n; i >= 0; i--) {
                printTriangle(i);
            }
        } else {
            System.out.println("Incorrect input");
        }

    }

    private static void printTriangle(int n) {
        String num = "";
        for (int i = 1; i <= n; i++) {
            num += i;
            num += " ";

        }
        System.out.println(num);
    }
}
