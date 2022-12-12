package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class orders09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double totalPrice = 0.0;
        for (int i = 0; i < n; i++) {
            double price = 0.0;
            double capsulePrice = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsuleCount = Integer.parseInt(scan.nextLine());
            price = ((days * capsuleCount) * capsulePrice);
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
