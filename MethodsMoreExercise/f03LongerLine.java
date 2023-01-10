package MethodsMoreExercise;

import java.util.Scanner;

public class f03LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Integer.parseInt(scan.nextLine());
        double y1 = Integer.parseInt(scan.nextLine());
        double x2 = Integer.parseInt(scan.nextLine());
        double y2 = Integer.parseInt(scan.nextLine());
        double x3 = Integer.parseInt(scan.nextLine());
        double y3 = Integer.parseInt(scan.nextLine());
        double x4 = Integer.parseInt(scan.nextLine());
        double y4 = Integer.parseInt(scan.nextLine());


        longerLine(x1,y1,x2,y2,x3,y3,x4,y4);

    }
    public static void longerLine (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {


        //longer line = √((x_2-x_1)²+(y_2-y_1)²)

        double length1 = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        double length2 = Math.sqrt((Math.pow((x4-x3),2) + Math.pow((y4-y3),2)));

        if (length1 >= length2 ) {

            if (nearestToZeroPoint(x1,y1,x2,y2)){

                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);

            }else {

                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);

            }

        } else {

            if (nearestToZeroPoint(x3,y3,x4,y4)){

                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);

            }else {

                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);

            }

        }
    }

    public static boolean nearestToZeroPoint(double x1, double y1, double x2, double y2) {

        double firstCoordinates = Math.sqrt((Math.pow(x1,2) + Math.pow(y1,2)));
        double secondCoordinates = Math.sqrt((Math.pow(x2,2) + Math.pow(y2,2)));

        if (firstCoordinates > secondCoordinates) {

            return false;

        } else return true;
    }
}
