package TextProcessingExercise;

import java.util.Scanner;

public class f06ReplaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != currentChar) {

                sb.append(currentChar);

            }
        }

        System.out.printf("%s", sb);

    }
}
