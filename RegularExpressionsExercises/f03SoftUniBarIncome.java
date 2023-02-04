package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f03SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("%(?<client>[A-Z][a-z]*)%([^|$%.]*)<(?<product>\\w+)>" +
                "([^|$%.]*)\\|(?<quantity>[0-9]+)\\|([^|$%.]*?)(?<price>[0-9]+.?[0-9]*)\\$");
        double income = 0;
        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String client = matcher.group("client");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                income += price * quantity;

                System.out.printf("%s: %s - %.2f\n", client, product, price * quantity);
            }

            input = scan.nextLine();

        }
        System.out.printf("Total income: %.2f", income);
    }
}
