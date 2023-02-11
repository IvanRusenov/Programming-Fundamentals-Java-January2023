package TextProcessingExercise;

import java.util.Scanner;

public class f04CaesarCipher {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {

            char ch = (char) (input.charAt(i) + 3);

            sb.append(ch);

        }

        System.out.println(sb);
    }
}
