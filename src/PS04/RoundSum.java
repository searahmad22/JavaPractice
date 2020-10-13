package PS04;

import java.util.Scanner;

public class RoundSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Rounded sum is " + roundSum(num1, num2, num3));
    }

    // This is the easier way to do roundSum, I found it out then I implemented this one, before I used dummyRoundSum.
    private static int roundSum(int number1, int number2, int number3) {
        int num = (number1 + number2 + number3);
        int operation = num % 10;

        if (operation >= 5) {
            num = (num - operation) + 10;
        } else {
            num = (num - operation);
        }

        return num;
    }

    private static int dummyRoundSum(int number1, int number2, int number3) {
        int result = number1 + number2 + number3;
        String num = Integer.toString(result);
        String sum = "";
        int lastDigit = Integer.parseInt(num.substring(num.length() - 1));

        // loop to add the numbers to the new String
        for (int i = 0; i < num.length()-2; i++) {
            sum += num.charAt(i);
        }

        //if the lenght of the summing numbers is les than 2
        if (num.length() < 2) {
            sum += (lastDigit >= 5 ? 10 : 0);

        }else {
            // if the lenght of the summing numbers is more than 2
            int preLastDigit = Integer.parseInt(num.substring(num.length() - 2, num.length() - 1));
            if (lastDigit >= 5) {
                sum += ((preLastDigit + 1) * 10);
            } else {
                sum += (preLastDigit * 10);
            }
        }

        return Integer.parseInt(sum);
    }
}
