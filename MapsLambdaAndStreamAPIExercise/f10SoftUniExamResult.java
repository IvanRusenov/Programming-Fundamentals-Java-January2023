package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f10SoftUniExamResult {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> programmingLanguages = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> examResults = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("exam finished")) {

            String[] data = input.split("-");

            if (data.length == 2) {

                String name = data[0];

                examResults.remove(name);

            } else if (data.length == 3) {

                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if (!examResults.containsKey(name)) {

                    examResults.put(name, points);

                } else {

                    if (examResults.get(name) < points) {
                        examResults.put(name, points);
                    }
                }

                if (!programmingLanguages.containsKey(language)) {

                    programmingLanguages.put(language, 1);

                } else {

                    programmingLanguages.put(language, programmingLanguages.get(language) + 1);

                }
            }

            input = scan.nextLine();
        }

        System.out.println("Results:");

        for (Map.Entry<String, Integer> entry : examResults.entrySet()) {
            System.out.printf("%s | %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions:");

        for (Map.Entry<String, Integer> entry : programmingLanguages.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
