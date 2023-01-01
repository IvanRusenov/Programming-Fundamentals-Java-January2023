package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f10TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] chest = scan.nextLine().split("\\|");
        String command = scan.nextLine();
        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {
                String[] lootArr = command.split(" ");
                for (int i = 1; i < lootArr.length; i++) {
                    String item = lootArr[i];
                    boolean isFound = false;
                    for (int j = 0; j < chest.length; j++) {
                        if (item.equals(chest[j])) {
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        String[] newChest = new String[chest.length + 1];
                        newChest[0] = item;
                        for (int j = 0; j < chest.length; j++) {
                            newChest[j + 1] = chest[j];
                        }
                        chest = newChest;
                    }
                }
            } else if (command.contains("Drop")) {
                String[] dropArr = command.split(" ");
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= chest.length - 1) {
                    String item = chest[index];
                    for (int i = index; i < chest.length - 1; i++) {
                        chest[i] = chest[i + 1];
                    }
                    chest[chest.length - 1] = item;
                }
            } else if (command.contains("Steal")) {
                //•	"Steal {count}":
                //o	Someone steals the last count loot items. If there are fewer items than the given count, remove as many as there are.
                //o	Print the stolen items separated by ", ":
                //"{item1}, {item2}, {item3} … {itemn}"
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index > chest.length){
                    index = chest.length;
                }
                for (int i = chest.length - index; i < chest.length; i++) {
                    if (i == chest.length - 1) {
                        System.out.printf("%s", chest[i]);
                    } else {
                        System.out.printf("%s, ", chest[i]);
                    }
                }
                System.out.println();
                chest = Arrays.copyOf(chest, chest.length - index);

            }

            command = scan.nextLine();
        }
        if (chest.length > 0) {
            int itemsLength = 0;
            for (String items : chest) {
                itemsLength += items.length();
            }
            double avgTreasure = 1.0 * itemsLength / chest.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", avgTreasure);
        } else {
            System.out.printf("Failed treasure hunt.");
        }
    }
}



