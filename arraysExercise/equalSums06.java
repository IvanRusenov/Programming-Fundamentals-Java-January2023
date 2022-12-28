package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //да погледна нулевия индекс
        //пробвай с вход 0


        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isSuchElement = false;
        for (int i = 0; i < numArr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = i + 1; j < numArr.length; j++) {
                rightSum += numArr[j];
            }
            for (int k = 0; k < i ; k++) {
                leftSum += numArr[k];
            }
             if (leftSum == rightSum) {
                System.out.println(i);
                isSuchElement = true;
            }

        }
        if (!isSuchElement) {
            System.out.println("no");
        }

    }
}
