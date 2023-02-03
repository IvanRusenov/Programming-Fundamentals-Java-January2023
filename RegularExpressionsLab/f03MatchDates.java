package RegularExpressionsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f03MatchDates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        Pattern pattern = Pattern.compile("(?<day>\\d{2})(?<separator>[\\/.-])(?<month>[A-Z][a-z]+)\\2(?<year>\\d{4})");

        Matcher mach = pattern.matcher(input);

        while (mach.find()) {

            String date = mach.group(1);
            String month = mach.group(3);
            String year = mach.group(4);
            System.out.printf("Day: %s, Month: %s, Year: %s\n", date, month, year);
        }


    }
}
