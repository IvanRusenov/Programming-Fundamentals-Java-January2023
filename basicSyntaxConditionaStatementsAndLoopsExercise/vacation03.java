package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class vacation03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peoplesCount = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;

        if (groupType.equals("Students")){
            if (dayOfWeek.equals("Friday")){
                price = 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46;
            }
            if (peoplesCount >= 30 ){
                totalPrice = peoplesCount * price *  0.85;
            }else {
                totalPrice = peoplesCount * price;

            }

        } else if (groupType.equals("Business")) {
            if (dayOfWeek.equals("Friday")){
                price = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16.00;
            }
            if (peoplesCount >= 100 ){
                peoplesCount -=10;
            }
            totalPrice = peoplesCount * price;

        }else if (groupType.equals("Regular")) {
            if (dayOfWeek.equals("Friday")){
                price = 15.00;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20.00;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.50;
            }

            if (peoplesCount >= 10 && peoplesCount <= 20 ){
                totalPrice = peoplesCount * price *  0.95;
            }else {
                totalPrice = peoplesCount * price;
            }
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
