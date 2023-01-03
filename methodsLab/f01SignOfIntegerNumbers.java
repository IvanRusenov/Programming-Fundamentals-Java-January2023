package MethodsLab;

import java.util.Scanner;

public class f01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInput = Integer.parseInt(scan.nextLine());

        printSign(numInput);


    }
    public static void printSign(int num) {
        if (num>0){
            System.out.printf("The number %d is positive.",num);
        } else if (num<0) {
            System.out.printf("The number %d is negative.",num);
        }else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}
