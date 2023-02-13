package ProgrammingFundamentalsMidExam05;

import java.util.Scanner;

public class f02MuOnline {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");
        int initialHelth = 100;
        int helth = initialHelth;
        int bitcoin = 0;
        boolean isThereAWin = true;

        for (int i = 0; i < input.length; i++) {

            String[] command = input[i].split(" ");

            if (command[0].equals("potion")) {

                int value = Integer.parseInt(command[1]);

                if (value + helth >= initialHelth) {

                    value = initialHelth - helth;

                    helth = initialHelth;

                } else {

                    helth += value;

                }
                System.out.printf("You healed for %d hp.\n", value);
                System.out.printf("Current health: %d hp.\n", helth);

            } else if (command[0].equals("chest")) {

                int value = Integer.parseInt(command[1]);
                bitcoin += value;
                System.out.printf("You found %d bitcoins.\n", value);

            } else {
                String monster = command[0];
                int monsterStrength = Integer.parseInt(command[1]);

                helth -= monsterStrength;

                if (helth <= 0) {

                    System.out.printf("You died! Killed by %s.\n", monster);
                    System.out.printf("Best room: %d", i + 1);
                    isThereAWin = false;
                    break;

                } else {

                    System.out.printf("You slayed %s.\n", monster);

                }
            }

        }

        if (isThereAWin) {

            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", bitcoin);
            System.out.printf("Health: %d\n", helth);
        }
    }
}
