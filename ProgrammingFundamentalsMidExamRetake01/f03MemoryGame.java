package ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03MemoryGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        int countMoves = 0;

        while (!input.equals("end")) {

            int index1 = Integer.parseInt(input.split(" ")[0]);
            int index2 = Integer.parseInt(input.split(" ")[1]);

            countMoves++;

            if (index1 == index2 || index1 < 0 || index1 > items.size() - 1
                    || index2 > items.size() - 1 || index2 < 0) {

                String element = String.format("-%da", countMoves);

                items.add(items.size() / 2, element);
                items.add(items.size() / 2, element);


                System.out.println("Invalid input! Adding additional elements to the board");

            } else if (items.get(index1).equals(items.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %s!\n", items.get(index1));

                if (index1 > index2) {
                    items.remove(index1);
                    items.remove(index2);
                } else {
                    items.remove(index2);
                    items.remove(index1);
                }

            } else {

                System.out.println("Try again!");
            }


            if (items.size() == 0) {

                System.out.printf("You have won in %d turns!", countMoves);
                return;
            }

            input = scan.nextLine();
        }

        System.out.println("Sorry you lose :(");

        for (String item : items) {
            System.out.printf("%s ", item);
        }
    }
}
