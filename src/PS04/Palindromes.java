//package PS04;

import java.util.Scanner;

public class Palindromes {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println((isPalindrome2(number) ? "This number is a palindrome" : "This number is not a palindrome"));
    }

    private static boolean isPalindrome2(int number) {
        String num = Integer.toString(number);
        String reverseNum = "";

        //reversing the String num
        for (int i = num.length() - 1; i >= 0; i--) reverseNum += num.charAt(i);

        return num.equals(reverseNum);
    }
}
