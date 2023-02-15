package ProgrammingFundamentalsMidExamRetake03;

import java.util.Scanner;

public class f01CounterStrike {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int energi = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int wins = 0;
        boolean isEnergiLeft = true;

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);


            if (energi - distance < 0) {

                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy\n", wins, energi);
                isEnergiLeft = false;
                break;
            } else {
                energi -= distance;
                wins++;

            }

            if (wins % 3 == 0) {
                energi += wins;
            }

            input = scan.nextLine();

        }

        if (isEnergiLeft) {

            System.out.printf("Won battles: %d. Energy left: %d\n", wins, energi);

        }
    }
}
