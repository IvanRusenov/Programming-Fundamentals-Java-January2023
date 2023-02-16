package ProgrammingFundamentalsMidExam02;

import java.util.Scanner;

public class f01SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());

        int studentsPerHour = a+b+c;
        int hours = 0;

        while(students > 0){

            students -= studentsPerHour;
            hours++;

            if (hours % 4 == 0){
                hours++;
            }
        }

        System.out.printf("Time needed: %dh.",hours);

    }
}
