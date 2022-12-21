package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class beerKegs08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double volume = 0.0;
        double maxVolume = Double.MIN_VALUE;
        String maxKegName = "";

        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double r = Double.parseDouble(scan.nextLine());
            int h = Integer.parseInt(scan.nextLine());
            volume = Math.PI * Math.pow(r,2) * h;
            if (volume > maxVolume){
                maxVolume = volume;
                maxKegName = model;
            }
        }
        System.out.println(maxKegName);
    }
}
