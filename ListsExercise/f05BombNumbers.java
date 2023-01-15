package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f05BombNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scan.nextLine().split("\\s+");

        detonateBomb(intList, input);

        printSumOfList(intList);

    }

    public static void printSumOfList(List<Integer> intList) {

        int result = 0;

        for (int item : intList) {
            result += item;
        }

        System.out.printf("%d", result);
    }

    public static void detonateBomb(List<Integer> intList, String[] input) {

        int bomb = Integer.parseInt(input[0]);

        while (isThereBomb(intList, bomb)) {

            int index = 0;
            for (int i = 0; i < intList.size(); i++) {
                if (bomb == intList.get(i)) {
                    index = i;
                    break;
                }
            }
            int bombPower = Integer.parseInt(input[1]);

            int start = index - bombPower;

            if (start < 0) {
                start = 0;
            }

            int end = index + bombPower;

            if (end >= intList.size()) {
                end = intList.size() - 1;
            }


            for (int i = start; i <= end; i++) {
                intList.remove(start);

            }

        }

    }

    public static boolean isThereBomb(List<Integer> intList, int bomb) {
        for (int item : intList) {
            if (item == bomb) {
                return true;
            }
        }
        return false;
    }
}
