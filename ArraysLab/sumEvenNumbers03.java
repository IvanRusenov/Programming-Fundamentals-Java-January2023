package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int item : numArr){
            if (item % 2 == 0){
                sum+=item;
            }
        }
        System.out.println(sum);

    }
}
