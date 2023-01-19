package midExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class f02ShoppingList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] intArr = Arrays
                .stream(scan.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scan.nextLine();


        while (!input.equals("end")) {

            String[] command = input.split(" ");

            if (command[0].equals("swap")) {

                swap(intArr, command);

            } else if (command[0].equals("multiply")) {

                multiply(intArr, command);

            } else if (command[0].equals("decrease")) {

                decrease(intArr);

            }

            input = scan.nextLine();
        }

        printArr(intArr);
    }

    //•	"swap {index1} {index2}" takes two elements and swap their places.
    public static void swap(int[] intArr, String[] command) {

        int index1 = Integer.parseInt(command[1]);
        int index2 = Integer.parseInt(command[2]);

        if (index1 >=0 && index1 <= intArr.length-1 && index2 >= 0 && index2 <= intArr.length-1){

            int element1 = intArr[index1];
            int element2 = intArr[index2];

            intArr[index1] = element2;
            intArr[index2] = element1;

        }

    }

    //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with
    // the element at 2nd index. Save the product at the 1st index.
    public static void multiply(int[] intArr, String[] command) {


        int index1 = Integer.parseInt(command[1]);
        int index2 = Integer.parseInt(command[2]);

        if (index1 >= 0 && index1 <= intArr.length-1 && index2 >= 0 && index2 <= intArr.length-1){

            int element1 = intArr[index1];
            int element2 = intArr[index2];

            int result = element1 * element2;
            intArr[index1] = result;
        }

    }

    //•	"decrease" decreases all elements in the array with 1.
    public static void decrease(int[] intArr) {

        for (int i = 0; i < intArr.length; i++) {

            intArr[i]--;

        }
    }

    public static void printArr(int[] intArr) {


        for (int i = 0; i < intArr.length; i++) {
            if (i != intArr.length - 1) {

                System.out.printf("%d, ", intArr[i]);

            } else {

                System.out.printf("%d ", intArr[i]);

            }

        }

        System.out.println();
    }

}
