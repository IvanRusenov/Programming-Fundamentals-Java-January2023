package ArraysMoreExercise;

import java.util.Scanner;

public class f02PascalTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[] arr = {1};
        for (int i = 1; i <= rows; i++) {
            int[] newArr = new int[i];
            for (int j = 0; j < i; j++) {
                if (j - 1 < 0) {
                    newArr[j] = arr[j];
                } else if (j > arr.length - 1) {
                    newArr[j] = arr[j - 1];
                } else {
                    newArr[j] = arr[j - 1] + arr[j];
                }
                System.out.printf("%d ", newArr[j]);
            }
            arr = newArr;
            System.out.println();
        }
    }
}
