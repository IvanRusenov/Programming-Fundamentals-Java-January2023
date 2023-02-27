package RegularExpressionsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class f05NetherRealms {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<String> monsters = Arrays.stream(input.split(","))
                .collect(Collectors.toList());

        for (String monster:monsters) {

            monster = monster.trim();
            Pattern pattern = Pattern.compile("[^\\d\\-*+/.]");
            Matcher match = pattern.matcher(monster);
            StringBuilder sb = new StringBuilder();
            int helth = 0;

            while (match.find()){

                sb.append(match.group());

            }

            for (char ch :sb.toString().toCharArray()) {

                helth += ch;

            }

            pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
            match = pattern.matcher(monster);
            double damage = 0.0;

            while(match.find()){

                damage += Double.parseDouble(match.group());

            }

            pattern = Pattern.compile("[*/]");
            match = pattern.matcher(monster);

            while(match.find()){

                if (match.group().equals("*")){

                    damage *= 2;

                } else if (match.group().equals("/")) {

                    damage /= 2;

                }

            }

            System.out.printf("%s - %d health, %.2f damage\n",monster,helth,damage);

        }
    }
}
