package MethodsMoreExercise;

import java.util.Scanner;

public class f04TribonacciSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        tribonacci(num);

    }
    public static void tribonacci (int n){
        int[] arr = {1,1,2};
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {

            if (i<3){
                System.out.printf("%d ",arr[i]);
                newArr[i] = arr[i];
            }else{

                newArr[i] = newArr[i-3] + newArr[i-2] + newArr[i-1];
                System.out.printf("%d ",newArr[i]);
            }

        }
    }


}
