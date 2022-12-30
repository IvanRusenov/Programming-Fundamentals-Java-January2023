package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f08MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == magicNumber && i != j){
                    System.out.printf("%d %d\n",nums[i],nums[j]);
                }
            }

        }
    }
}
