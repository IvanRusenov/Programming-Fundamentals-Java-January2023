package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] numArr = new int[n];
        //int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {

           numArr[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf("%d ",numArr[i]);
        }

    }
}
