package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f04StarEnigma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String name = "";
        String attackType = "";
        int attackedPlanetsCount = 0;
        int destroyedPlanetsCount = 0;
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();
            Pattern pattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);
            Matcher match = pattern.matcher(input);
            int count = 0;

            while (match.find()) {
                count++;
            }

            StringBuilder sb = new StringBuilder();

            for (char ch : input.toCharArray()) {
                ch = (char) (ch - count);
                sb.append(ch);
            }

            String regex =  "@(?<name>[A-Za-z]+)([^:!\\-@>]*):*(?<population>\\d+)([^:!\\-@>]*)" +
                            "!*(?<attackType>(?i)[ad])!*([^:!\\-@>]*)-*>(?<soldiersCount>\\d+)";

            pattern = Pattern.compile(regex);
            match = pattern.matcher(sb);

            if (match.find()) {

                name = match.group("name");
                attackType = match.group("attackType").toUpperCase();

                if (attackType.equals("A")) {

                    attackedPlanetsCount++;
                    attackedPlanets.add(name);

                } else if (attackType.equals("D")) {

                    destroyedPlanetsCount++;
                    destroyedPlanets.add(name);

                }

            }

        }

        System.out.printf("Attacked planets: %d\n", attackedPlanetsCount);

        if (attackedPlanetsCount > 0) {

            Collections.sort(attackedPlanets);

            for (String item : attackedPlanets) {

                System.out.printf("-> %s\n", item);

            }

        }

        System.out.printf("Destroyed planets: %d\n", destroyedPlanetsCount);

        if (destroyedPlanetsCount > 0) {

            Collections.sort(destroyedPlanets);

            for (String item : destroyedPlanets) {

                System.out.printf("-> %s\n", item);

            }

        }

    }
}
