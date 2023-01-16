package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f08AnonymousThreat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> strList = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());


        String[] command = scan.nextLine().split(" ");

        while (!(command[0].equals("3:1"))) {

            if (command[0].equals("merge")) {

                merge(strList, command);

            } else if (command[0].equals("divide")) {

                divide(strList, command);

            }

            command = scan.nextLine().split(" ");
        }

        for (String item : strList) {
            System.out.printf("%s ", item);
        }

    }

    //•	merge {startIndex} {endIndex}
    public static void merge(List<String> strList, String[] command) {

        int startIndex = Integer.parseInt(command[1]);
        int endIndex = Integer.parseInt(command[2]);

        if (startIndex < 0) {

            startIndex = 0;

        }

        if (endIndex > strList.size() - 1) {

            endIndex = strList.size() - 1;

        }

        if (startIndex <= strList.size() - 1 && endIndex >= 0) { //!!!

            List<String> subList = new ArrayList<>();

            for (int i = startIndex; i <= endIndex; i++) {

                subList.add(strList.get(i));

            }

            for (int i = 0; i <= endIndex - startIndex; i++) {

                strList.remove(startIndex);

            }

            String mergedString = "";
            for (String element : subList) {
                mergedString += element;
            }

            strList.add(startIndex, mergedString);

        }

    }
    //•	divide {index} {partitions}
    public static void divide(List<String> strList, String[] command) {

        int index = Integer.parseInt(command[1]);
        int partitions = Integer.parseInt(command[2]);

        if (index >= 0 && index < strList.size() && partitions > 0) {

            String element = strList.get(index);
            strList.remove(index);
            List<String> subList = new ArrayList<>();
            int partitionsLength = element.length() / partitions;
            int count = 0;

            if (element.length() % partitions == 0) {

                for (int i = 0; i < partitions; i++) {
                    String newElement = "";
                    for (int j = 0; j < partitionsLength; j++) {
                        //[abcdefghijklm]

                        newElement += element.charAt(count);
                        count++;

                    }
                    subList.add(newElement);
                }

            } else {

                for (int i = 0; i < partitions - 1; i++) {
                    String newElement = "";
                    for (int j = 0; j < partitionsLength; j++) {

                        newElement += element.charAt(count);
                        count++;

                    }
                    subList.add(newElement);
                }
                String newElement = "";
                for (int i = count; i < element.length(); i++) {

                    newElement += element.charAt(count);
                    count++;
                }
                subList.add(newElement);

            }

            strList.addAll(index, subList);

        }
    }
}
