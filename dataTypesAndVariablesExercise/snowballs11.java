package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class snowballs11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnowballQuality =0;
        int maxSnowballTime = 0;
        int maxSnowballSnow =0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double snowballValue =Math.pow((1.0 * snowballSnow / snowballTime),snowballQuality);
            if (snowballValue > maxValue){
                maxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxValue,maxSnowballQuality);



    }
}
