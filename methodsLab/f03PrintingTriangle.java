package MethodsLab;

import java.util.Scanner;

public class f03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printTriangle(n);

    }
    public static void printTriangle (int num){
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.printf("%d ",col);
            }
            System.out.println();
        }
        for (int i = num -1; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();

        }

    }
}
