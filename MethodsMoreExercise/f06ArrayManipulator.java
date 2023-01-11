package MethodsMoreExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class f06ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int[] intArr = takingArray(input);
        String command = scan.nextLine();

        while (!command.equals("end")) {

            if (command.contains("exchange")) {
                ///!!!
                intArr = exchange(command, intArr);

            } else if (command.contains("max")) {

                max(command, intArr);

            } else if (command.contains("min")) {

                min(command, intArr);

            } else if (command.contains("first")) {

                first(command, intArr);

            } else if (command.contains("last")) {

                last(command, intArr);

            }


            command = scan.nextLine();
        }
        System.out.println(Arrays.toString(intArr));

    }

    public static int[] takingArray(String input) {

        int[] intArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        return intArr;

    }

    public static int[] exchange(String command, int[] intArr) {

        String[] exchange = command.split(" ");

        int index = Integer.parseInt(exchange[1]);

        if (index < 0 || index > intArr.length - 1) {

            System.out.println("Invalid index");

        } else {

            int[] newIntArr = new int[intArr.length];

            System.arraycopy(intArr, index + 1, newIntArr, 0, intArr.length - (index + 1));

            System.arraycopy(intArr, 0, newIntArr, intArr.length - (index + 1), index + 1);

            intArr = newIntArr;

        }
        return intArr;
    }

    public static void max(String command, int[] intArr) {

        String[] maxArr = command.split(" ");

        int maxNum = Integer.MIN_VALUE;
        int indexOfMax = 0;
        boolean isFound = false;

        if (maxArr[1].equals("even")) {

            for (int i = 0; i < intArr.length; i++) {

                if (intArr[i] % 2 == 0) {

                    isFound = true;

                    if (intArr[i] >= maxNum) {
                        maxNum = intArr[i];
                        indexOfMax = i;

                    }
                }
            }
        } else if (maxArr[1].equals("odd")) {

            for (int i = 0; i < intArr.length; i++) {

                if (intArr[i] % 2 != 0) {

                    isFound = true;

                    if (intArr[i] >= maxNum) {
                        maxNum = intArr[i];
                        indexOfMax = i;
                    }
                }
            }
        }

        if (isFound) {
            System.out.printf("%d\n", indexOfMax);
        } else {
            System.out.println("No matches");
        }

    }

    public static void min(String command, int[] intArr) {

        String[] minArr = command.split(" ");

        int minNum = Integer.MAX_VALUE;
        int indexOfMin = 0;
        boolean isFound = false;

        if (minArr[1].equals("even")) {

            for (int i = 0; i < intArr.length; i++) {

                if (intArr[i] % 2 == 0) {

                    isFound = true;

                    if (intArr[i] <= minNum) {

                        minNum = intArr[i];
                        indexOfMin = i;

                    }
                }
            }
        } else if (minArr[1].equals("odd")) {

            for (int i = 0; i < intArr.length; i++) {

                if (intArr[i] % 2 != 0) {

                    isFound = true;

                    if (intArr[i] <= minNum) {
                        minNum = intArr[i];
                        indexOfMin = i;
                    }
                }
            }
        }

        if (isFound) {
            System.out.printf("%d\n", indexOfMin);
        } else {
            System.out.println("No matches");
        }

    }

    public static void first(String command, int[] intArr) {

        String[] firstArr = command.split(" ");
        int index = Integer.parseInt(firstArr[1]);

        if (index > intArr.length) {

            System.out.println("Invalid count");

        } else {
            int count = 0;
            int[] newArr = new int[index];

            if (firstArr[2].equals("even")) {
                for (int num : intArr) {
                    if (num % 2 == 0 && count < index) {

                        newArr[count] = num;
                        count++;
                    }
                }


            } else if (firstArr[2].equals("odd")) {

                for (int num : intArr) {
                    if (num % 2 != 0 && count < index) {

                        newArr[count] = num;
                        count++;
                    }
                }

            }

            int[] finalArr = new int[count];
            for (int i = 0; i < count; i++) {
                finalArr[i] = newArr[i];
            }
            System.out.println(Arrays.toString(finalArr));
        }

    }

    public static void last(String command, int[] intArr) {

        String[] firstArr = command.split(" ");

        int index = Integer.parseInt(firstArr[1]);

        if (index > intArr.length) {

            System.out.println("Invalid count");

        } else {

            int count = 0;
            int[] newArr = new int[intArr.length];

            if (firstArr[2].equals("even")) {

                for (int i = 0; i < intArr.length; i++) {

                    if (intArr[i] % 2 == 0) {
                        newArr[count] = intArr[i];
                        count++;
                    }
                }


            } else if (firstArr[2].equals("odd")) {

                for (int i = 0; i < intArr.length; i++) {

                    if (intArr[i] % 2 != 0) {
                        newArr[count] = intArr[i];
                        count++;
                    }
                }

            }

            int[] finalArr = new int[count];

            for (int i = 0; i < count; i++) {
                finalArr[i] = newArr[i];
            }


            if (count >= index) {
                int[] lastX = new int[index];

                System.arraycopy(finalArr, (finalArr.length - index), lastX, 0, index);

                System.out.println(Arrays.toString(lastX));

            } else {
                System.out.println(Arrays.toString(finalArr));
            }


        }

    }

}
