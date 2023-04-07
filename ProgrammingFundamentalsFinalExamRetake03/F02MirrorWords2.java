package F03ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02MirrorWords2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<first>[a-zA-Z]{3,})\\1\\1(?<second>[a-zA-Z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> words = new ArrayList<>();
        boolean isPairs = false;
        boolean isMirrorWords = false;

        int count = 0;

        while (matcher.find()) {

            isPairs = true;
            count++;
            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            StringBuilder sb = new StringBuilder(secondWord);

            if (firstWord.equals(sb.reverse().toString())) {

                String pairs = String.format("%s <=> %s", firstWord, secondWord);

                words.add(pairs);
                isMirrorWords = true;

            }

        }

        if (isPairs) {

            System.out.printf("%d word pairs found!\n", count);


        } else {

            System.out.println("No word pairs found!");

        }

        if (isMirrorWords) {

            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", words));


        } else {

            System.out.println("No mirror words!");

        }

    }
}
