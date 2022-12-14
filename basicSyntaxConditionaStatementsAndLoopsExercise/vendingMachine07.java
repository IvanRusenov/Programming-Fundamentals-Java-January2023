package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class vendingMachine07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0.0;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);;
            if (coins== 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.00 || coins == 2.00){
                sum+= coins;
            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }

            input = scan.nextLine();
        }
        String product = scan.nextLine();
        double price = 0.0;
        while (!product.equals("End")){
            if(product.equals("Nuts")){
                price = 2.00;
            } else if (product.equals("Water")) {
                price = 0.70;
            }else if (product.equals("Crisps")) {
                price = 1.50;
            }else if (product.equals("Soda")) {
                price = 0.80;
            }else if (product.equals("Coke")) {
                price = 1.00;
            }else {
                System.out.println("Invalid product");
                product = scan.nextLine();
                continue;
            }

            if (price>sum){
                System.out.println("Sorry, not enough money");
            }else {
                sum = sum - price;
                System.out.printf("Purchased %s%n",product);
            }
            product =scan.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
