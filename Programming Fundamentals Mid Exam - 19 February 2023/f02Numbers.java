package ProgrammingFundamentalsMidExam_19_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Finish")) {

            String[] command = input.split("\\s+");

            if (command[0].startsWith("Add")) {

                int value = Integer.parseInt(command[1]);
                sequence.add(value);

            } else if (command[0].startsWith("Remove")) {

                int value = Integer.parseInt(command[1]);

                for (int i = 0; i < sequence.size(); i++) {

                    if (sequence.get(i) == value) {

                        sequence.remove(i);
                        break;
                    }
                }

            } else if (command[0].startsWith("Replace")) {

                int value = Integer.parseInt(command[1]);
                int replacement = Integer.parseInt(command[2]);

                for (int i = 0; i < sequence.size(); i++) {

                    if (sequence.get(i) == value) {

                        sequence.set(i, replacement);
                        break;
                    }
                }

            } else if (command[0].startsWith("Collapse")) {

                int value = Integer.parseInt(command[1]);

                for (int i = 0; i < sequence.size(); i++) {

                    if (sequence.get(i) < value) {

                        sequence.remove(i);
                        i--;
                    }
                }

            }

            input = scan.nextLine();
        }

        for (int item : sequence) {
            System.out.printf("%d ", item);
        }
    }
}
