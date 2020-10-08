package PS04;

import java.util.Scanner;

public class Decimal2Binary {

    public static void main(String[] args) {
         //you may modify the code below, but try to preserve the program structure
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %08d", decimalNumber, decimalToBinary(decimalNumber));


    }

    private static int decimalToBinary(int decimalNumber) {

        String binary = "";

        int i = 0;
        while (i < 8) {
            int result = decimalNumber % 2;
            binary += result;


            decimalNumber = decimalNumber / 2;

            i++;

            }

        int binaryNumber = Integer.parseInt(reverseString(binary));



        return binaryNumber;
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
