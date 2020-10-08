package PS03;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade >= 0 && grade <50) {
            System.out.println("Failed");
        }else if (grade >= 50 && grade <= 100) {
            System.out.println("Passed");
        }else {
            System.out.println("Incorrect grade!");
        }
    }
}
