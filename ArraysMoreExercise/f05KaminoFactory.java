package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f05KaminoFactory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int lengthOfTheLongestSequence = 0;
        int startIndexOfLongestSequence = 0;
        int longestSequenceCount = 0;
        int[] longestSequance = new int[length];
        int sum = 0;
        int count = 0;

        while (!input.equals("Clone them!")) {

            int[] sequence = Arrays.stream(input.split("!+"))  //test 2
                    .mapToInt(Integer::parseInt).toArray();
            count++;

            int[] data = calculateLengthStartIndexAndSum(sequence);

            if (lengthOfTheLongestSequence < data[0]) {

                longestSequenceCount = count;
                longestSequance = sequence;
                lengthOfTheLongestSequence = data[0];
                startIndexOfLongestSequence = data[1];
                sum = data[2];

            } else if (lengthOfTheLongestSequence == data[0]) {

                if (startIndexOfLongestSequence > data[1]) {

                    startIndexOfLongestSequence = data[1];
                    longestSequance = sequence;
                    sum = data[2];
                    longestSequenceCount = count;

                } else if (startIndexOfLongestSequence == data[1]) {

                    if (sum < data[2]) {

                        longestSequance = sequence;
                        sum = data[2];
                        longestSequenceCount = count;

                    }
                }
            }

            input = scan.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", longestSequenceCount, sum);

        for (int item : longestSequance) {

            System.out.printf("%d ", item);

        }

    }

    public static int[] calculateLengthStartIndexAndSum(int[] intArr) {

        int startIndex = 0;
        int length = 0;
        int sum = 0;
        int startIndexOfLongestSequence = 0;
        int lengthOfTheLongestSequence = 0;

        for (int i = 0; i < intArr.length - 1; i++) {

            if (intArr[i] == intArr[i + 1]) {

                if (length == 0) {

                    startIndex = i;
                    length++;

                }
                length++;

            } else {

                if (length != 0) {

                    if (lengthOfTheLongestSequence < length) {
                        lengthOfTheLongestSequence = length;
                        startIndexOfLongestSequence = startIndex;
                    }

                    startIndex = 0;
                    length = 0;

                }
            }
            if (lengthOfTheLongestSequence < length) {
                lengthOfTheLongestSequence = length;
                startIndexOfLongestSequence = startIndex;
            }

        }

        for (int j : intArr) {

            sum += j;

        }

        return new int[]{lengthOfTheLongestSequence, startIndexOfLongestSequence, sum};

    }
}
