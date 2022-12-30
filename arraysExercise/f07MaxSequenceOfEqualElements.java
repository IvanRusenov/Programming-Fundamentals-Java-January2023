package arraysExercise;

import java.util.Scanner;

public class f07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nums = scan.nextLine().split(" ");
        int count = 0;
        int biggestSequence = 0;
        String num = "";
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i].equals(nums[i+1])){
                count++;
            }else{
                count = 0;
            }
            if (biggestSequence < count ){
                biggestSequence = count;
                num = nums[i];
            }
        }
        for (int i = 0; i <= biggestSequence; i++) {
            System.out.printf("%s ",num);
        }


    }
}
