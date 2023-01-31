package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class f06StudentAcademy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> student = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!student.containsKey(name)) {

                student.put(name, new ArrayList<>());

            }

            student.get(name).add(grade);

        }

        Map<String, Double> studentsAvgGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : student.entrySet()) {

            double sumAllGrades = 0.0;

            for (Double item : entry.getValue()) {

                sumAllGrades += item;

            }

            double avgGrade = sumAllGrades / entry.getValue().size();

            if (avgGrade >= 4.50){
                studentsAvgGrade.put(entry.getKey(), avgGrade);
            }

        }

        for (Map.Entry<String, Double> entry : studentsAvgGrade.entrySet()) {

            System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue());
        }

    }
}
