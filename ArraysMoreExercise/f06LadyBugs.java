package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f06LadyBugs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scan.nextLine());

        int[] indexesOfAllLadybugs = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];

        if (indexesOfAllLadybugs.length > 0) {

            for (int i = 0; i < indexesOfAllLadybugs.length; i++) {

                if (indexesOfAllLadybugs[i] >= 0 && indexesOfAllLadybugs[i] < field.length) {

                    field[indexesOfAllLadybugs[i]] = 1;
                }

            }

            String input = scan.nextLine();

            while (!input.equals("end")) {

                int ladybugIndex = Integer.parseInt(input.split("\\s+")[0]);
                String direction = input.split("\\s+")[1];
                int flyLength = Integer.parseInt(input.split("\\s+")[2]);

                if (ladybugIndex >= 0 && ladybugIndex < field.length && field[ladybugIndex] == 1) {

                    if (direction.equals("left")) {

                        field[ladybugIndex] = 0;

                        int count = 1;

                        while (ladybugIndex - flyLength * count >= 0
                                && ladybugIndex - flyLength * count < field.length
                                && field[ladybugIndex - flyLength * count] == 1) {

                            count++;

                        }

                        if (ladybugIndex - flyLength * count >= 0
                                && ladybugIndex - flyLength * count < field.length) {

                            field[ladybugIndex - flyLength * count] = 1;

                        }

                    } else if (direction.equals("right")) {

                        field[ladybugIndex] = 0;

                        int count = 1;

                        while (ladybugIndex + flyLength * count < field.length
                                && ladybugIndex + flyLength * count >= 0
                                && field[ladybugIndex + flyLength * count] == 1) {

                            count++;

                        }

                        if (ladybugIndex + flyLength * count < field.length
                                && ladybugIndex + flyLength * count >= 0) {

                            field[ladybugIndex + flyLength * count] = 1;

                        }
                    }
                }
                input = scan.nextLine();
            }
        }
        for (int item : field) {
            System.out.printf("%d ", item);
        }
    }
}
