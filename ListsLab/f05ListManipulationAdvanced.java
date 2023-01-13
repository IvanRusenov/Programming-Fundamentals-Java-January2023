package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<String> stringList = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scan.nextLine();
        while (!command.equals("end")) {

            String[] commandArr = command.split(" ");

            if (commandArr[0].equals("Contains")) {

                contains(stringList, commandArr);

            } else if (commandArr[0].equals("Print")) {

                print(stringList, commandArr);

            } else if (commandArr[0].equals("Get")) {

                printSum(stringList, commandArr);

            } else if (commandArr[0].equals("Filter")) {

                filter(stringList, commandArr);

            }

            command = scan.nextLine();
        }

    }

    //Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
    public static void contains(List<String> strList, String[] commandArr) {

        if (strList.contains(commandArr[1])) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }

    //Print even – print all the numbers that are even separated by a space
    //Print odd – print all the numbers that are oddly separated by a space
    public static void print(List<String> stringList, String[] commandArr) {

        if (commandArr[1].equals("odd")) {
            for (String element : stringList) {
                int num = Integer.parseInt(element);
                if (num % 2 != 0) {
                    System.out.printf("%d ", num);
                }
            }
            System.out.println();

        } else if (commandArr[1].equals("even")) {
            for (String element : stringList) {
                int num = Integer.parseInt(element);
                if (num % 2 == 0) {
                    System.out.printf("%d ", num);
                }
            }
            System.out.println();
        }
    }

    //Get sum – print the sum of all the numbers
    public static void printSum(List<String> stringList, String[] commandArr) {
        int result = 0;
        for (String element : stringList) {
            int num = Integer.parseInt(element);
            result += num;
        }
        System.out.println(result);
    }

    //Filter {condition} {number} – print all the numbers that fulfill that condition.
    // The condition will be either '<', '>', ">=", "<="
    public static void filter(List<String> strList, String[] commandArr) {

        int num = Integer.parseInt(commandArr[2]);

        if (commandArr[1].equals("<")) {
            for (String element : strList) {
                int item = Integer.parseInt(element);
                if (item < num) {

                    System.out.printf("%d ", item);
                }
            }
            System.out.println();
        } else if (commandArr[1].equals(">")) {
            for (String element : strList) {
                int item = Integer.parseInt(element);
                if (item > num) {

                    System.out.printf("%d ", item);
                }
            }
            System.out.println();
            ;
        } else if (commandArr[1].equals("<=")) {
            for (String element : strList) {
                int item = Integer.parseInt(element);
                if (item <= num) {

                    System.out.printf("%d ", item);
                }
            }
            System.out.println();
        } else if (commandArr[1].equals(">=")) {
            for (String element : strList) {
                int item = Integer.parseInt(element);
                if (item >= num) {

                    System.out.printf("%d ", item);
                }
            }
            System.out.println();
        }
    }

}
