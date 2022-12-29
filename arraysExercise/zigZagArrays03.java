package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagArrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            int[] nums = Arrays.stream(scan.nextLine()
                    .split(" "))
                    .mapToInt(Integer :: parseInt)
                    .toArray();
            if (i % 2 == 0){
               firstArr[i] = nums[0];
               secondArr[i] = nums[1];
            }else{
                firstArr[i] = nums[1];
                secondArr[i] = nums[0];
            }
        }
        for (int item:firstArr) {
            System.out.printf("%d ",item);
        }
        System.out.println();
        for (int item:secondArr) {
            System.out.printf("%d ",item);
        }
    }
}
