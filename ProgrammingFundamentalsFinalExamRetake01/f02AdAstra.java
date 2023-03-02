package ProgrammingFundamentalsFinalExamRetake01;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f02AdAstra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([#\\|])(?<name>[a-zA-Z\\s]+)(\\1)(?<date>(\\d{2}\\/\\d{2}\\/\\d{2}))(\\1)(?<calories>\\d+)(\\1)");
        Matcher match = pattern.matcher(input);
        int totalCalories = 0;
        List<String> products = new ArrayList<>();

        while (match.find()){

            String name = match.group("name");
            String date  = match.group("date");
            int calories = Integer.parseInt(match.group("calories"));

            String product  = String.format("Item: %s, Best before: %s, Nutrition: %d",name,date,calories);
            products.add(product);
            totalCalories += calories;

        }
        double days = 1.0 * totalCalories / 2000;

        System.out.printf("You have food to last you for: %.0f days!\n",Math.floor(days));

        for (String item : products) {
            System.out.println(item);
        }

    }
}
