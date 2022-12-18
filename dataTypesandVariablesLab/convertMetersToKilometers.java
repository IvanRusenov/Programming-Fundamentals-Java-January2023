package dataTypesandVariablesLab;

import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int meters = Integer.parseInt(scan.nextLine());
        double km = 1.0 * meters /1000;
        System.out.printf("%.2f",km);
    }
}
