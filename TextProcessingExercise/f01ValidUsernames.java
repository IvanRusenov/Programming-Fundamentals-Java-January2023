package TextProcessingExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f01ValidUsernames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");


        for (String item : input) {
            boolean isValid = false;
            if (item.length() >= 3 && item.length() <= 16) {


                Pattern pattern = Pattern.compile("[A-Za-z0-9-_]+");
                Matcher match = pattern.matcher(item);

                if (match.find()) {

                    if (match.group().equals(item)) {
                        isValid = true;
                    }

                }
            }

            if (isValid) {
                System.out.printf("%s\n", item);
            }
        }
    }
}
