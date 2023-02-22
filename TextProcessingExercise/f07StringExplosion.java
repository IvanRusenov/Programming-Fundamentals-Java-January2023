package TextProcessingExercise;

import java.util.Scanner;

public class f07StringExplosion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        int strength = 0;

        for (int i = 0; i < sb.length(); i++) {

            char currentChar = sb.charAt(i);

            if (currentChar == '>') {

                strength += Integer.parseInt(sb.charAt(i + 1) + "");

            } else if (strength > 0) {

                sb.deleteCharAt(i);
                i--;
                strength--;
            }

        }

        System.out.println(sb);

    }
}
