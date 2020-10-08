package PS04;

import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(showTwos(num));
    }

    public static String showTwos(int number){
        boolean status = true;
        String num = Integer.toString(number) + " = ";

        if (number % 2 != 0) {
            num += number;

        } else while (status) {

            if (number % 2 == 0) {
                num += 2 + " * ";
                number /= 2;
                if (number % 2 != 0) {
                    num += number;
                }

            } else {
                status = false;
            }
        }

        return num;
    }
}
