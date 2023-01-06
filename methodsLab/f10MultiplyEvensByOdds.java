package MethodsLab;

import java.util.Scanner;

public class f10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(multiplySumOfEvensAndOdds(num));

    }
    public static int multiplySumOfEvensAndOdds(int num){
        int oddSum = 0;
        int evenSum = 0;

        while(Math.abs(num) > 0){
            int digit = num % 10;
            if ( digit % 2 == 0){
                evenSum += digit;
            }else {
                oddSum +=digit;
            }
            num /= 10;
        }

        return  evenSum * oddSum;
    }

}
