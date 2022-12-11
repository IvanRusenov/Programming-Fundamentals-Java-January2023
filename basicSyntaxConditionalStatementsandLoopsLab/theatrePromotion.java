package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class theatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeOfTheDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;
        boolean isValidData = true;

        if (typeOfTheDay.equals("Weekday")){
            if (age>=0 && age<=18){
                price = 12;
            } else if (age >18 && age <=64) {
                price = 18;
            }else if (age >64 && age <=122) {
                price = 12;
            }else {
                isValidData = false;
            }
        } else if (typeOfTheDay.equals("Weekend")) {
            if (age>=0 && age<=18){
                price = 15;
            } else if (age >18 && age <=64) {
                price = 20;
            }else if (age >64 && age <=122) {
                price = 15;
            }else {
                isValidData = false;
            }
        } else if (typeOfTheDay.equals("Holiday")) {
            if (age>=0 && age<=18){
                price = 5;
            } else if (age >18 && age <=64) {
                price = 12;
            }else if (age >64 && age <=122) {
                price = 10;
            }else {
                isValidData = false;
            }
        }

        if (isValidData){
            System.out.printf("%d$",price);
        }else {
            System.out.println("Error!");
        }
    }
}
