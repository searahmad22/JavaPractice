package PS04;

import java.util.Scanner;

public class Abberation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String result = "";
        for (int i = 0; i < num; i++) {
            String word = input.next();
            if (word.length() > 10) {
                result += abbreviate(word) + "\n";
            } else {
                result += word + "\n";
            }
        }
        System.out.print(result);
    }

    private static String abbreviate(String word) {
        String abb = word.substring(0,1) + (word.length() - 2) + word.substring(word.length() - 1);
        return abb;
    }
}
