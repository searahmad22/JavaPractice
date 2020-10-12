package PS04;//package PS04;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if (isPrime(i)){
                System.out.printf("%d ", i);
            } else {
                continue;
            }
        }

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
