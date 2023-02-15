package ProgrammingFundamentalsMidExamRetake03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split(" ");

            if (command[0].startsWith("Shoot")) {

                int index = Integer.parseInt(command[1]);
                int power = Integer.parseInt(command[2]);

                if (index >= 0 && index < targets.size()) {

                    targets.set(index, targets.get(index) - power);

                    if (targets.get(index) <= 0) {
                        targets.remove(index);
                    }
                }

            } else if (command[0].startsWith("Add")) {

                int index = Integer.parseInt(command[1]);
                int value = Integer.parseInt(command[2]);

                if (index >= 0 && index < targets.size() && value > 0)  {

                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command[0].startsWith("Strike")) {

                int index = Integer.parseInt(command[1]);
                int radius = Integer.parseInt(command[2]);
                int startIndex = index - radius;
                int endIndex = index + radius;

                if (startIndex >= 0 && endIndex  < targets.size()) {

                    for (int i = startIndex; i <= endIndex; i++) {
                        targets.remove(startIndex);
                    }

                } else {
                    System.out.println("Strike missed!");
                }

            }

            input = scan.nextLine();

        }

        for (int i = 0; i < targets.size(); i++) {

            if (i != targets.size() - 1) {
                System.out.printf("%d|", targets.get(i));
            } else {
                System.out.printf("%d", targets.get(i));
            }

        }

    }
}