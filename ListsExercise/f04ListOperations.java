package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f04ListOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] inputAsArr = input.split("\\s+");
            String command = inputAsArr[0];

            if (command.equals("Add")) {

                add(intList, inputAsArr);

            } else if (command.equals("Insert")) {

                insert(intList, inputAsArr);

            } else if (command.equals("Remove")) {

                remove(intList, inputAsArr);

            } else if (command.equals("Shift")) {

                shift(intList, inputAsArr);
            }

            input = scan.nextLine();
        }

        printList(intList);

    }

    //check for "Invalid index"
    public static boolean isValidIndex(List<Integer> intList, int index) {
        return index >= 0 && index < intList.size();

    }

    //•	Add {number} - add number at the end
    public static void add(List<Integer> intList, String[] inputAsArr) {

        int number = Integer.parseInt(inputAsArr[1]);

        intList.add(number);

    }

    //•	Insert {number} {index} - insert number at given index
    public static void insert(List<Integer> intList, String[] inputAsArr) {

        int number = Integer.parseInt(inputAsArr[1]);
        int index = Integer.parseInt(inputAsArr[2]);

        if (isValidIndex(intList, index)) {

            intList.add(index, number);

        } else {
            System.out.println("Invalid index");
        }

    }

    //•	Remove {index} - remove that index
    public static void remove(List<Integer> intList, String[] inputAsArr) {

        int index = Integer.parseInt(inputAsArr[1]);

        if (isValidIndex(intList, index)) {

            intList.remove(index);


        } else {
            System.out.println("Invalid index");
        }

    }

    //•	Shift direction  {count}
    public static void shift(List<Integer> intList, String[] inputAsArr) {

        int count = Integer.parseInt(inputAsArr[2]);

        String direction = inputAsArr[1];

        if (direction.equals("left")) {//•	Shift left {count} - first number becomes last 'count' times

            for (int i = 0; i < count; i++) {

                intList.add(intList.get(0));
                intList.remove(0);

            }

        } else if (direction.equals("right")) { //•	Shift right {count} - last number becomes first 'count' times

            for (int i = 0; i < count; i++) {

                intList.add(0, intList.get(intList.size() - 1));
                intList.remove(intList.size() - 1);

            }
        }

    }

    public static void printList(List<Integer> intList) {

        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }

}
