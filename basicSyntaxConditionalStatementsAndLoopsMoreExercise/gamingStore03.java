package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class gamingStore03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        double gamePrice = 0.0;
        double totalSpend = 0.0;

        String input = scan.nextLine();
        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                gamePrice = 39.99;
            } else if (input.equals("CS: OG")) {
                gamePrice = 15.99;
            } else if (input.equals("Zplinter Zell")) {
                gamePrice = 19.99;
            } else if (input.equals("Honored 2")) {
                gamePrice = 59.99;
            } else if (input.equals("RoverWatch")) {
                gamePrice = 29.99;
            } else if (input.equals("RoverWatch Origins Edition")) {
                gamePrice = 39.99;
            }else {
                System.out.println("Not Found");
                input = scan.nextLine();
                continue;
            }
            if (gamePrice>balance){
                System.out.println("Too Expensive");
                input = scan.nextLine();
                continue;
            }
            totalSpend += gamePrice;
            System.out.printf("Bought %s%n",input);
            balance -= gamePrice;
            if (balance<=0){
                System.out.println("Out of money!");
                return;
            }
            input = scan.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend,balance);
    }
}
