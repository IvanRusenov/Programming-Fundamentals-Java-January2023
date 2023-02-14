package ProgrammingFundamentalsMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02ShoppingList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Go Shopping!")) {

            String[] command = input.split(" ");

            if (command[0].startsWith("Urgent")) {

                String item = command[1];

                if (!shoppingList.contains(item)) {

                    shoppingList.add(0, item);
                }

            } else if (command[0].startsWith("Unnecessary")) {

                String item = command[1];

                if (shoppingList.contains(item)) {

                    shoppingList.remove(item);
                }

            } else if (command[0].startsWith("Correct")) {

                String oldItem = command[1];
                String newItem = command[2];

                if (shoppingList.contains(oldItem)) {

                    shoppingList.set(shoppingList.indexOf(oldItem), newItem);
                }

            } else if (command[0].startsWith("Rearrange")) {

                String item = command[1];

                if (shoppingList.contains(item)) {

                    shoppingList.remove(item);
                    shoppingList.add(item);
                }

            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", shoppingList));
    }
}
