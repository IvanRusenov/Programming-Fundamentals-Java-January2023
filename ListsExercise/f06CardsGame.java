package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f06CardsGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        game(firstPlayer, secondPlayer);

    }

    public static void game(List<Integer> first, List<Integer> second) {

        while (first.size() != 0 && second.size() != 0) {

            int firstPlayerHand = first.get(0);
            int secondPlayerHand = second.get(0);

            if (firstPlayerHand > secondPlayerHand) {

                first.add(firstPlayerHand);
                first.add(secondPlayerHand);

                removeFirstIndex(first, second);

            } else if (firstPlayerHand < secondPlayerHand) {

                second.add(secondPlayerHand);
                second.add(firstPlayerHand);

                removeFirstIndex(first, second);

            } else {

                removeFirstIndex(first, second);

            }

        }

        printWinner(first, second);

    }

    public static void removeFirstIndex(List<Integer> first, List<Integer> second) {

        first.remove(0);
        second.remove(0);
    }

    public static void printWinner(List<Integer> first, List<Integer> second) {

        String winner = "";
        int sum = 0;

        if (first.size() == 0) {

            winner = "Second";

            for (int item : second) {
                sum += item;
            }

        } else {

            winner = "First";

            for (int item : first) {
                sum += item;
            }

        }



        System.out.printf("%s player wins! Sum: %d", winner, sum);

    }

}
