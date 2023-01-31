package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class f05Courses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {

            String[] data = input.split(" : ");

            String courseName = data[0];
            String studentName = data[1];

            if (!courses.containsKey(courseName)) {

                courses.put(courseName, new ArrayList<>());

            }

            courses.get(courseName).add(studentName);

            input = scan.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {

            System.out.printf("%s: %d\n-- %s\n",
                    entry.getKey(),
                    entry.getValue().size(),
                    String.join(System.lineSeparator() + "-- ",
                    entry.getValue()));
        }
    }
}
