package TextProcessingMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f01ExtractPersonInformation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte n = Byte.parseByte(scan.nextLine());

        for (byte i = 0; i < n; i++) {

            String text = scan.nextLine();
            String name = "";
            int age = 0;

            Pattern namePattern = Pattern.compile("(?<=@)\\w+(?=\\|)");
            Matcher nameMatch = namePattern.matcher(text);
            Pattern agePattern = Pattern.compile("(?<=#)\\d+(?=\\*)");
            Matcher ageMatch = agePattern.matcher(text);

            if (nameMatch.find()) {
                name = nameMatch.group();
            }

            if (ageMatch.find()) {
                age = Integer.parseInt(ageMatch.group());
            }

            System.out.printf("%s is %d years old.\n", name, age);

        }

    }
}
