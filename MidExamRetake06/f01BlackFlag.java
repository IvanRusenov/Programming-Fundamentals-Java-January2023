package MidExamRetake06;

import java.util.Scanner;

public class f01BlackFlag {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());
        double totalPlunder = 0.0;

        for (int i = 1; i <= days; i++) {

            totalPlunder += dailyPlunder;

            if (i % 3 == 0) {

                totalPlunder += dailyPlunder * 0.50;

            }

            if (i % 5 == 0) {

                totalPlunder = totalPlunder * 0.70;

            }

        }

        if (totalPlunder >= expectedPlunder) {

            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);

        } else {

            double percentageLeft = totalPlunder / expectedPlunder * 100.00;

            System.out.printf("Collected only %.2f%% of the plunder.", percentageLeft);
        }
    }
}
