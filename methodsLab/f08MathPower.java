package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class f08MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        double result = calculation(num,power);
        System.out.println(new DecimalFormat("0.####").format(calculation(num,power)));
    }

    public static double calculation (double a, int b){
        double result = 1.00;
        for (int i = 0; i < b ; i++) {
            result *= a;
        }
        return  result;
    }
}
