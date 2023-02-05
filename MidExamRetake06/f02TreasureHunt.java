package MidExamRetake1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02TreasureHunt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> chest = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scan.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] command = input.split(" ");

            if (command[0].equals("Loot")) {

                for (int i = 1; i < command.length; i++) {

                    if (!chest.contains(command[i])) {
                        chest.add(0, command[i]);
                    }
                }

            } else if (command[0].equals("Drop")) {

                int index = Integer.parseInt(command[1]);

                if (index >= 0 && index < chest.size()) {
                    String item = chest.get(index);
                    chest.remove(index);
                    chest.add(item);
                }

            } else if (command[0].equals("Steal")) {

                int count = Integer.parseInt(command[1]);

                if (count < chest.size() && count > 0) {

                    List<String> stolenItems = chest.subList(chest.size() - count, chest.size());

                    System.out.println(String.join(", ", stolenItems));

                    chest.removeAll(stolenItems);

                } else if (count >= chest.size()) {

                    List<String> stolenItems = chest.subList(0, chest.size());
                    System.out.println(String.join(", ", stolenItems));

                    chest.removeAll(stolenItems);
                }

            }


            input = scan.nextLine();

        }

        int itemsLength = 0;

        for (String item : chest) {

            itemsLength += item.length();

        }

        if (chest.size() > 0) {
            double avgTreasureGain = 1.0 * itemsLength / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", avgTreasureGain);

        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
