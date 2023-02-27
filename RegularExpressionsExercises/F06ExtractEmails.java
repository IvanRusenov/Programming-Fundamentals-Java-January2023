package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F06ExtractEmails {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "((?<name>[A-Za-z0-9]+[\\w\\-.]*[A-Za-z0-9]+)@" +
                "(?<host>[A-Za-z0-9]+[\\w\\-]*[A-Za-z0-9]+\\." +
                "[A-Za-z0-9]+[\\w\\-]*[A-Za-z0-9]+" +
                "(\\.[A-Za-z0-9]+[\\w\\-]*[A-Za-z0-9]+)?))";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        String email = "";

        while (match.find()) {

            email = match.group();

            System.out.printf("%s\n", email);
        }
    }
}
