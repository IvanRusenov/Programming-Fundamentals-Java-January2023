package MethodsLab;

import java.util.Scanner;

public class f02Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gradeInput = Double.parseDouble(scan.nextLine());

        printGrade(gradeInput);
    }
    public static void printGrade(double grade){
        if (grade >=2 && grade <= 2.99){
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        }else if (grade <= 4.49) {
            System.out.println("Good");
        }else if (grade <= 5.49) {
            System.out.println("Very good");
        }else if (grade <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
