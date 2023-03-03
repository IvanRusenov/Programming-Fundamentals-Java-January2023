package ProgrammingFundamentalsFinalExam02;

import java.util.Scanner;

public class f01WorldTour {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String stops = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Travel")) {

            String[] command = input.split(":");
            StringBuilder sb = new StringBuilder(stops);

            if (command[0].startsWith("Add")) {

                int index = Integer.parseInt(command[1]);
                String stop = command[2];

                if (index >= 0 && index < stops.length()) {

                    sb.insert(index, stop);
                    stops = sb.toString();

                }

                System.out.println(stops);

            } else if (command[0].startsWith("Remove")) {

                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                if (startIndex >= 0 && endIndex < stops.length() && (startIndex <= endIndex)) {

                    sb.delete(startIndex, endIndex + 1);
                    stops = sb.toString();

                }

                System.out.println(stops);

            } else if (command[0].startsWith("Switch")) {

                String oldString = command[1];
                String newString = command[2];

                if (stops.contains(oldString)) {

                    stops = stops.replace(oldString, newString);

                }

                System.out.println(stops);

            }

            input = scan.nextLine();

        }

        System.out.printf("Ready for world tour! Planned stops: %s\n", stops);

    }
}
