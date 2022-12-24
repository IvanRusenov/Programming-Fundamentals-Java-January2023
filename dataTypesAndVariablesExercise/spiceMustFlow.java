package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yeald = Integer.parseInt(scan.nextLine());
        int count = 0;
        int totalExtracted = 0;
        while (yeald >= 100){
            count++;
            totalExtracted += yeald;
            yeald -= 10;
            totalExtracted -= 26;
        }
        if (totalExtracted >= 26){
            totalExtracted -= 26;
        }else {
            totalExtracted -= totalExtracted;
        }
        System.out.println(count);
        System.out.println(totalExtracted);
    }
}
