package ProgrammingFundamentalsMidExamRetake03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02ShootForTheWin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        int count = 0;

        while (!input.equals("End")) {

            int index = Integer.parseInt(input);

            if (index >= 0 && index < targets.size()) {

                int targetValue = targets.get(index);

                targets.set(index, -1);
                count++;

                for (int i = 0; i < targets.size(); i++) {

                    if (targets.get(i) > 0) {

                        if (targets.get(i) > targetValue) {

                            targets.set(i, targets.get(i) - targetValue);

                        } else {
                            targets.set(i, targets.get(i) + targetValue);
                        }
                    }
                }
            }

            input = scan.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);

        for (int item : targets) {
            System.out.printf("%d ", item);
        }

    }
}
