package PS04;

import java.util.Scanner;

public class Palindromes {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println((isPalindrome2(number) ? "This number is a palindrome" : "This number is not a palindrome"));




    }

    private static boolean isPalindrome2(int number) {
        int reverseN = 0;

        for(int i = number; i != 0; i = i / 10) {
            reverseN = reverseN * 10;
            reverseN += (i % 10);
        }
        return reverseN == number;
    }
}
