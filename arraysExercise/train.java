package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] numArr = new int[n];
        int sum = 0;
        String result = "";
        for (int i = 0; i < n ; i++) {
            numArr[i] = Integer.parseInt(scan.nextLine());
            sum+=numArr[i];
            System.out.printf("%d ",numArr[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
