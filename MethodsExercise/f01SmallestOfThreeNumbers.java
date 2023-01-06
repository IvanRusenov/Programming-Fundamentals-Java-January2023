package MethodsExercise;

import java.util.Scanner;

public class f01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        smallestOfThreeNumbers(num1, num2, num3);
    }
    public static void smallestOfThreeNumbers(int n1, int n2, int n3){
        if (n1 < n2 && n1<n3){
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        } else if (n3 <= n1 && n3 < n2) {
            System.out.println(n3);
        }else {
            System.out.println(n1); // if three number are equal
        }
    }
}
