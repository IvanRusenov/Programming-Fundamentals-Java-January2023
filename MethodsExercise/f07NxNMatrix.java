package MethodsExercise;

import java.util.Scanner;

public class f07NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printMatrix(n);

    }
    public static void printMatrix (int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ",n);
            }
            System.out.println();
        }
    }

}
