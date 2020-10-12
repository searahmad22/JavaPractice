package PS04;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num1 = console.nextInt();
        String sign = console.next();
        int num2 = console.nextInt();

        int result = 0;

        switch (sign) {
            case "+":
                result = addition(num1, num2);
                System.out.println(result);
                break;
            case "-":
                result = subtraction(num1, num2);
                System.out.println(result);
                break;
            case "*":
                result = multiplication(num1, num2);
                System.out.println(result);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Error");
                }else {
                    result = division(num1, num2);
                    System.out.println(result);
                }
                break;
            case "%":
                if (num2 == 0){
                    System.out.println("Error");
                }else {
                    result = mode(num1, num2);
                    System.out.println(result);
                }
                break;

            default:
        }


    }

    private static int addition(int number1, int number2) {
        return number1 + number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    private static int division(int dividend, int divisor) {
        return dividend / divisor;
    }

    private static int mode(int number1, int number2) {return number1 % number2;}
}
