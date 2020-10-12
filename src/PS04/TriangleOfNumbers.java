package PS04;//package PS04;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            printTriangle(i);
        }
    }

    private static void printTriangle(int n) {
        String num = "";
        for (int i = 1; i <= n; i++) {
            num += i;

        }
        System.out.println(num);
    }
}
