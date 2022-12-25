package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int [] intArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(intArr.length > 1){
            int sum[] = new int[intArr.length - 1];
            for (int i = 0; i < sum.length  ; i++) {
                sum[i] = intArr[i] + intArr[i+1];
            }
            intArr = sum;

        }
        System.out.println(intArr[0]);
    }
}
