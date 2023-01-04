package MethodsLab;

import java.util.Scanner;

public class f06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double area = area(width,height);
        System.out.printf("%.0f",area);
    }
    public static double area (double a, double b){
        return a * b;
    }
}
