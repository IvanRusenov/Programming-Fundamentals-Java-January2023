package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] intArr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] intArr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isEqual = true;
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i]==intArr2[i]){
                sum+=intArr1[i];
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isEqual = false;
                break;
            }
        }
        if (isEqual){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
