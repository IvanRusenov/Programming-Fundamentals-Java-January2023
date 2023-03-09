package ProgrammingFundamentalsFinalExam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02EmojiDetector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        long coolThreshold = 1L;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            byte digit = Byte.parseByte(matcher.group());
            coolThreshold *= digit;

        }

        System.out.printf("Cool threshold: %d\n",coolThreshold);
        pattern = Pattern.compile("(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})(\\1)");
        matcher = pattern.matcher(input);
        byte count = 0;
        List<String> emojiList = new ArrayList<>();

        while (matcher.find()) {

            count++;
            String emoji = matcher.group();
            String emojiLetters = matcher.group("emoji");
            int coolness = 0;

            for (int i = 0; i < emojiLetters.length(); i++) {

                coolness += emojiLetters.charAt(i);
            }

            if (coolness >= coolThreshold){

                emojiList.add(emoji);

            }

        }

        System.out.printf("%d emojis found in the text. The cool ones are:\n",count);
        System.out.println(String.join(System.lineSeparator(),emojiList));

    }
}
