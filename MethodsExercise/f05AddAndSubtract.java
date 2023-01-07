package MethodsExercise;

import java.util.Scanner;

public class f05AddAndSubtract {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

       printResult(subtract(sum(num1, num2),num3));

    }

    public static int sum(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static int subtract (int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    public static void printResult (int n1){
        System.out.println(n1);
    }

}
