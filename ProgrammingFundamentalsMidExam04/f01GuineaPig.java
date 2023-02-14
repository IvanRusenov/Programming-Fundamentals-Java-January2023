package ProgrammingFundamentalsMidExam04;

import java.util.Scanner;

public class f01GuineaPig {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double food = Double.parseDouble(scan.nextLine());
        double hay = Double.parseDouble(scan.nextLine());
        double cover = Double.parseDouble(scan.nextLine());
        double weight = Double.parseDouble(scan.nextLine());
        boolean isEnough = true;

        for (int i = 1; i <= 30; i++) {

            food -= 0.300;
            if (food <= 0) {
                isEnough = false;
                break;
            }
            if (i % 2 == 0) {
                hay -= food * 0.05;
                if (hay <= 0) {
                    isEnough = false;
                    break;
                }

            }
            if (i % 3 == 0) {
                cover -= weight / 3;
                if (cover <= 0) {
                    isEnough = false;
                    break;
                }

            }

        }
        if (isEnough) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.\n", food, hay, cover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
