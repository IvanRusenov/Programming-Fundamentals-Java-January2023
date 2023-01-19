package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03Inventory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> craftList = Arrays
                .stream(scan.nextLine()
                        .split(", "))
                .collect(Collectors.toList());


        String input = scan.nextLine();


        while (!input.equals("Craft!")) {

            String[] command = input.split(" - ");

            if (command[0].equals("Collect")) {

                collect(craftList, command);

            } else if (command[0].equals("Drop")) {

                drop(craftList, command);
            } else if (command[0].equals("Combine Items")) {

                combineItems(craftList, command);

            } else if (command[0].equals("Renew")) {

                renew(craftList, command);

            }

            input = scan.nextLine();
        }

        printCraftList(craftList);

    }

    //•	"Collect - {item}" - you should add the given item to your inventory.
    // If the item already exists, you should skip this line.
    public static void collect(List<String> craftList, String[] command) {

        String item = command[1];

        if (!isExist(craftList, item)) {

            craftList.add(item);

        }

    }

    //•	"Drop - {item}" - you should remove the item from your inventory if it exists.
    public static void drop(List<String> craftList, String[] command) {

        String item = command[1];

        if (isExist(craftList, item)) {

            craftList.remove(item);
            //check remove one or removeAll ?

        }

    }

    //•	"Combine Items - {old_item}:{new_item}" - you should check
    // if the old item exists. If so, add the new item after the old one.
    // Otherwise, ignore the command.
    public static void combineItems(List<String> craftList, String[] command) {

        String[] elements = command[1].split(":");
        String oldItem = elements[0];
        String newItem = elements[1];

        if (isExist(craftList, oldItem)) {

            craftList.add(craftList.indexOf(oldItem) + 1, newItem);
        }

    }

    //•	"Renew – {item}" – if the given item exists, you should change its
    // position and put it last in your inventory.
    public static void renew(List<String> craftList, String[] command) {

        String item = command[1];

        if (isExist(craftList, item)) {

            craftList.remove(item);
            craftList.add(item);
        }
    }
    public static boolean isExist(List<String> craftList, String item) {


        boolean isExist = false;

        for (String element : craftList) {

            if (item.equals(element)) {

                return true;

            }
        }
        return false;
    }

    public static void printCraftList(List<String> craftList) {


        for (int i = 0; i < craftList.size(); i++) {
            if (i != craftList.size() - 1) {

                System.out.printf("%s, ", craftList.get(i));

            } else {

                System.out.printf("%s ", craftList.get(i));

            }

        }

        System.out.println();
    }
}
