package dataTypesandVariablesLab;

import java.util.Scanner;

public class poundsToDollars02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pound =Double.parseDouble(scan.nextLine());
        double usd = pound * 1.36;
        System.out.printf("%.3f",usd);
    }
}
