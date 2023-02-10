package TextProcessingExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f03ExtractFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(?<name>[^\\\\]*)\\.(?<extension>\\w+)");

        Matcher match = pattern.matcher(input);

        if (match.find()) {
            System.out.printf("File name: %s\n", match.group("name"));
            System.out.printf("File extension: %s\n", match.group("extension"));
        }
    }
}
