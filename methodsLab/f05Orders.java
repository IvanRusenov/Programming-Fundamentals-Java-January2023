package MethodsLab;

import java.util.Scanner;

public class f05Orders {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        if (product.equals("coffee")) {

            orderPrice(coffee(), quantity);

        } else if (product.equals("water")) {

            orderPrice(water(), quantity);

        } else if (product.equals("coke")) {

            orderPrice(coke(), quantity);

        } else if (product.equals("snacks")) {

            orderPrice(snacks(), quantity);
        }

    }

    public static void orderPrice(double price, int quantity) {
        double result = price * quantity;
        System.out.printf("%.2f", result);
    }

    public static double coffee() {
        return 1.50;
    }

    public static double water() {
        return 1.00;
    }

    public static double coke() {
        return 1.40;
    }

    public static double snacks() {
        return 2.00;
    }

}
