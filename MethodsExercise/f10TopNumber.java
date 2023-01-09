package MethodsExercise;

import java.util.Scanner;

public class f10TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        isDivisibleBy8(n);

    }
    public static void isDivisibleBy8 (int n){

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int num = i;
            while (num > 0){
                int digit = num % 10;
                sumOfDigits += digit;
                num /= 10;
            }
            if (sumOfDigits % 8 == 0 && isOneOddDigit(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean isOneOddDigit (int n){

       while (n > 0){
           int digit = n % 10;
           if (digit % 2 != 0) {
               return true;
               // return breaks method
           }
           n /= 10;
       }
       return false;
    }
}
