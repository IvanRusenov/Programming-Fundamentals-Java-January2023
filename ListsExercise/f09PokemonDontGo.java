package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f09PokemonDontGo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> removed = new ArrayList<>();

        while (intList.size() != 0) {

            int index = Integer.parseInt(scan.nextLine());
            int element = 0;

            if (index < 0) {

                element = intList.get(0);
                intList.set(0, intList.get(intList.size() - 1));


            } else if (index > intList.size() - 1) {

                element = intList.get(intList.size() - 1);
                intList.set(intList.size() - 1, intList.get(0));


            } else {

                element = intList.get(index);
                intList.remove(index);

            }

            removed.add(element);

            for (int i = 0; i < intList.size(); i++) {

                if (intList.get(i) <= element) {

                    intList.set(i, (intList.get(i) + element));

                } else {

                    intList.set(i, (intList.get(i) - element));

                }
            }

        }

        int sum = 0;
        for (int item : removed) {
            sum += item;
        }

        System.out.printf("%d", sum);

    }

}
