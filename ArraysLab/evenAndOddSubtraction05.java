package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;


        for (int item : intArr){
            if (item % 2 == 0){
                evenSum+=item;
            }else{
                oddSum += item;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
