package RegularExpressionsMoreExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f03PostOffice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] parts = input.split("\\|");
        String regex1 = "([#$%*&])(?<letters>[A-Z]+)(\\1)";
        String regex2 = "(?<ascii>\\d{2}):(?<length>\\d{2})";
        Pattern pattern = Pattern.compile(regex1);
        Matcher match = pattern.matcher(parts[0]);
        StringBuilder letters = new StringBuilder();                                                                                //TODO:

        while (match.find()) {

            letters.append(match.group("letters"));
        }

        pattern = Pattern.compile(regex2);
        match = pattern.matcher(parts[1]);
        LinkedHashMap<Character, Integer> wordsMap = new LinkedHashMap<>();

        while (match.find()) {

            char ascii = (char) Integer.parseInt(match.group("ascii"));
            int length = Integer.parseInt(match.group("length"));

            wordsMap.put(ascii, length);

        }

        for (char letter : letters.toString().toCharArray()) {

            if (wordsMap.containsKey(letter)) {

                String regex3 = String.format("((^|(?<=\\s))[%c][^\\s]{%d}\\b)", letter, wordsMap.get(letter));
                pattern = Pattern.compile(regex3);
                match = pattern.matcher(parts[2]);

                while (match.find()) {

                    System.out.printf("%s\n", match.group());
                }
            }
        }
    }
}