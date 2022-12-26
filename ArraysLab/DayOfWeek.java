package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] daysArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ( n <= 0 || n > daysArr.length){
            System.out.println("Invalid day!");
        }else {
            System.out.println(daysArr[n-1]);

        }
    }
}
