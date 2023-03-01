package RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f04SantasSecretHelper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());

        String messages = scan.nextLine();
        List<String> names = new ArrayList<>();

        while(!messages.equals("end")){

            StringBuilder sb = new StringBuilder();

            for (char ch:messages.toCharArray()) {

                sb.append((char)(ch - key));
            }

            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)([^@\\-!:>]*)[!](?<behavior>[GN])[!]");
            Matcher match = pattern.matcher(sb);

            while (match.find()){

                String name = match.group("name");
                String behavior= match.group("behavior");

                if (behavior.equals("G")){

                    names.add(name);
                }
            }

            messages = scan.nextLine();

        }

        for (String name:names) {

            System.out.printf("%s\n",name);
        }
    }
}
