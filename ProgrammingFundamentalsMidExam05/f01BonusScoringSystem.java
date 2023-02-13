package ProgrammingFundamentalsMidExam05;

import java.util.Scanner;

public class f01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int bonus = Integer.parseInt(scan.nextLine());
        double maxBonus = Double.MIN_VALUE;
        double maxAtendances = 0.0;

        for (int i = 0; i < students; i++) {
            double attendance = Double.parseDouble(scan.nextLine());
            double totalBonus = attendance / lectures * (5 + bonus);
            if (totalBonus >= maxBonus) {
                maxBonus = totalBonus;
                maxAtendances = attendance;
            }
        }

        System.out.printf("Max Bonus: %d.\n", Math.round(maxBonus));
        System.out.printf("The student has attended %.0f lectures.", maxAtendances);

    }
}
