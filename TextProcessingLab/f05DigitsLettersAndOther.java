package TextProcessingLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f05DigitsLettersAndOther {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        Pattern letterPattern = Pattern.compile("[A-Za-z]");
        Matcher letterMatch = letterPattern.matcher(input);

        Pattern digitPattern = Pattern.compile("[0-9]");
        Matcher digitMatch = digitPattern.matcher(input);

        Pattern symbolPattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher symbolMatch = symbolPattern.matcher(input);

        while (letterMatch.find()) {

            letters.append(letterMatch.group());
        }

        while (digitMatch.find()) {
            digits.append(digitMatch.group());
        }

        while (symbolMatch.find()) {
            symbols.append(symbolMatch.group());
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
