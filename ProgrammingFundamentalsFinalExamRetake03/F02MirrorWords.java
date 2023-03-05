package ProgrammingFundamentalsFinalExamRetake03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02MirrorWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([#@])(?<word1>[A-Za-z]{3,})(\\1)(\\1)(?<word2>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        boolean isFound = false;
        boolean isPairFound = false;
        List<String> words = new ArrayList<>();

        while (matcher.find()) {

            isFound = true;
            count++;
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");
            StringBuilder sb = new StringBuilder(word2);
            sb.reverse();

            if (word1.equals(sb.toString())) {

                isPairFound = true;
                String pair = String.format("%s <=> %s", word1, word2);
                words.add(pair);

            }

        }

        if (isFound) {

            System.out.printf("%d word pairs found!\n", count);

        } else {

            System.out.println("No word pairs found!");

        }

        if (isPairFound) {

            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", words));

        } else {

            System.out.println("No mirror words!");

        }
    }
}
