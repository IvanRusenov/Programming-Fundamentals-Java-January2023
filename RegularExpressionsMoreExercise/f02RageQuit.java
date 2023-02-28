package RegularExpressionsMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f02RageQuit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(?<text>\\D+)(?=\\d)(?<times>\\d+)");
        Matcher match = pattern.matcher(input);
        StringBuilder message = new StringBuilder();

        while (match.find()) {

            String text = match.group("text");
            int number = Integer.parseInt(match.group("times"));

            message.append(text.repeat(number).toUpperCase());

        }

        System.out.printf("Unique symbols used: %d\n", message.chars().distinct().count());
        System.out.println(message);

    }
}
