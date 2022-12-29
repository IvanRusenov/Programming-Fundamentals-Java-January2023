package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numArr.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    isBigger = true;
                }else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.printf("%d ",numArr[i]);
            }
        }
    }
}
