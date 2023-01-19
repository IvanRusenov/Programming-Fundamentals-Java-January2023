package midExamPreparation;

import java.util.Scanner;

public class f01GuineaPig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//•	On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0].

        double foodInKg = Double.parseDouble(scan.nextLine());

//•	On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0].

        double hayInKg = Double.parseDouble(scan.nextLine());

//•	On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0].

        double coverInKg = Double.parseDouble(scan.nextLine());

//•	On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0].

        double weightInKg = Double.parseDouble(scan.nextLine());
        boolean isEnough = true;


        for (int i = 1; i <= 30; i++) {

            double eatenFoodForDay = 0.300;
            foodInKg -= eatenFoodForDay;

            if (Math.round(foodInKg) <= 0 ){

                isEnough = false;
                break;
            }

            if (i % 2 == 0){

                double usedHay = foodInKg * 0.05;

                hayInKg -= usedHay;

                if (Math.round(hayInKg) <= 0){

                    isEnough = false;
                    break;
                }

            }

            if (i % 3 == 0) {
                double usedCover = weightInKg / 3;
                coverInKg -= usedCover;

                if (Math.round(coverInKg)<= 0){

                    isEnough = false;
                    break;
                }
            }


        }

        if(isEnough){

            System.out.printf("Everything is fine! Puppy is happy! Food:" +
                    " %.2f, Hay: %.2f, Cover: %.2f.",foodInKg,hayInKg,coverInKg);


        }else{

            System.out.println("Merry must go to the pet store!");
        }

    }
}
