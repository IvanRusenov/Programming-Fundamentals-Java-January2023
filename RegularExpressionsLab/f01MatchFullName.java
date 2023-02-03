package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f01MatchFullName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");

        Matcher mach = pattern.matcher(input);

        while (mach.find()) {
            System.out.printf("%s ", mach.group());
        }
    }
}
