package TextProcessingExercise;

import java.util.Scanner;

public class f02CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        String word1 = input[0];
        String word2 = input[1];
        int result = 0;
        int shortestWord = Math.min(word1.length(), word2.length());
        int longestWord = Math.max(word1.length(), word2.length());

        for (int i = 0; i < shortestWord; i++) {

            result += word1.charAt(i) * word2.charAt(i);

        }

        if (word1.length() > word2.length()) {

            for (int i = shortestWord; i < longestWord; i++) {
                result += word1.charAt(i);
            }


        } else {

            for (int i = shortestWord; i < longestWord; i++) {
                result += word2.charAt(i);
            }

        }

        System.out.println(result);

    }
}
