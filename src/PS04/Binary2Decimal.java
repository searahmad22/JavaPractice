package PS04;

import java.util.Scanner;

public class Binary2Decimal {

    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        String binary = reverseString(Integer.toString(binaryNumber));
        int decimalNumber = 0;

        for (int i = 0; i < binary.length(); i++){

            char num = binary.charAt(i);
            int coefficient = Integer.parseInt(String.valueOf(num));

            int p2 = (int) Math.pow(2, i);

            decimalNumber += coefficient * p2;
        }


        return decimalNumber;
    }

    public static String reverseString(String string) {

        String b = "";
        int len = string.length();

        for (int i = (len - 1); i >= 0; i--){
            b += string.charAt(i);
        }

        return b;

    }
}
