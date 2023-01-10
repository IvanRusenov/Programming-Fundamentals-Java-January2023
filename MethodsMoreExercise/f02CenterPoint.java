package MethodsMoreExercise;

import java.util.Scanner;

public class f02CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // presume integers
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

        nearestToZeroPoint(x1, y1, x2, y2);

    }

    public static void nearestToZeroPoint(int x1, int y1, int x2, int y2) {
        int firstCoordinates = Math.abs(x1) + Math.abs(y1);
        int secondCoordinates = Math.abs(x2) + Math.abs(y2);
        if (firstCoordinates > secondCoordinates) {

            System.out.printf("(%d, %d)", x2, y2);

        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}



