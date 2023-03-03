package ProgrammingFundamentalsFinalExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f02DestinationMapper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String places = scan.nextLine();

        Pattern pattern = Pattern.compile("([=\\/])(?<place>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher match = pattern.matcher(places);
        int travelPoints = 0;
        List<String> destinations = new ArrayList<>();

        while (match.find()) {

            destinations.add(match.group("place"));
            travelPoints += match.group("place").length();

        }

        System.out.printf("Destinations: %s\n", String.join(", ", destinations));
        System.out.printf("Travel Points: %d\n", travelPoints);

    }
}
