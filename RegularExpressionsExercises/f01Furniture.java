package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f01Furniture {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(">>(?<item>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");
        double spendMoney = 0.0;
        System.out.println("Bought furniture:");
        while(!input.equals("Purchase")){
            Matcher match = pattern.matcher(input);

           while (match.find()) {

                String item = match.group("item");
                double price = Double.parseDouble(match.group("price"));
                int quantity = Integer.parseInt(match.group("quantity"));
                spendMoney += price * quantity;
                System.out.printf("%s\n",item);
            }

            input = scan.nextLine();
        }



        System.out.printf("Total money spend: %.2f",spendMoney);

    }
}
