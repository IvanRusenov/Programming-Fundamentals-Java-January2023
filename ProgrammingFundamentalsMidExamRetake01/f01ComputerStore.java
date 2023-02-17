package ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class f01ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalPrice = 0.0;

        while(!(input.equals("special") || input.equals("regular"))){

//            if (input.equals("special")){
//
//                break;
//
//            } else if (input.equals("regular")) {
//
//                break;
//
//            }

            double price = Double.parseDouble(input);

            if (isValidPrice(price)){

                totalPrice += price;

            }else {
                System.out.println("Invalid price!");
            }

            input = scan.nextLine();

        }

        if (totalPrice == 0){

            System.out.println("Invalid order!");

        }else {
            double taxes = totalPrice * 0.20;
           double finalPrice = totalPrice + taxes;

            if (input.equals("special")){

                finalPrice *= 0.90;

            }

            System.out.printf("Congratulations you've just bought a new computer!\nPrice without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                            "-----------\n" +
                    "Total price: %.2f$\n",totalPrice,taxes,finalPrice);
        }

    }
    public static boolean isValidPrice(double price){

       return price >= 0;
    }
}
