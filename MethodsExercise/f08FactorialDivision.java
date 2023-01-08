package MethodsExercise;

import java.util.Scanner;

public class f08FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        long f1 = calculateFactorial(num1);
        long f2 = calculateFactorial(num2);
        double result = factorialDivision(f1,f2);
        print(result);
//        print(factorialDivision(calculateFactorial(num1),calculateFactorial(num2)));

    }
    public static long calculateFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static double factorialDivision(long f1, long f2){
        return  1.0 * f1 / f2 ;
    }

    public static void print(double result){
        System.out.printf("%.2f", result);
    }

}
