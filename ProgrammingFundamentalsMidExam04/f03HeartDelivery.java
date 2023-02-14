package ProgrammingFundamentalsMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> neighborhood = Arrays.stream(scan.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        int index = 0;

        while (!input.equals("Love!")) {

            index += Integer.parseInt(input.split(" ")[1]);

            if (index >= neighborhood.size()) {

                index = 0;
            }

            if (neighborhood.get(index) == 0) {

                System.out.printf("Place %d already had Valentine's day.\n", index);

            } else {

                neighborhood.set(index, neighborhood.get(index) - 2);

                if (neighborhood.get(index) == 0) {

                    System.out.printf("Place %d has Valentine's day.\n", index);
                }

            }

            input = scan.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n", index);

        boolean isValentine = true;
        int count = 0;

        for (Integer item : neighborhood) {

            if (item != 0) {
                count++;
                isValentine = false;

            }
        }

        if (isValentine) {

            System.out.println("Mission was successful.");

        } else {

            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}
