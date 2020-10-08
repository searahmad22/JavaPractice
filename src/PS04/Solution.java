package PS04;

import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        System.out.println(capitalize(sentence));
    }

    public static String capitalize(String sentence) {
        String s2 = "";

        // loop in order to find the spaces
        for (int i = 0; i < sentence.length(); i++) {

            //if the index is not zero it does look for the space in index - 1
            if ((i != 0) && (sentence.charAt(i - 1) == ' ')) {
                s2 += sentence.substring(i, i + 1).toUpperCase();

            //it capitalizes the first letter of the sentence
            } else if (i == 0) {
                s2 += sentence.substring(i, i + 1).toUpperCase();

            //if the index-1 is not space the the value will be added to the s2 string
            } else {
                s2 += sentence.charAt(i);
            }
        }
        return s2;
    }
}
