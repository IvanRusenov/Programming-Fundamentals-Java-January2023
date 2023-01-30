package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f03Orders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashMap<String,Integer> productMap = new LinkedHashMap<>();
        LinkedHashMap<String,Double> productPrice = new LinkedHashMap<>();

        while(!input.equals("buy")){

            String[] data = input.split(" ");

            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!productMap.containsKey(name)){

                productMap.put(name,quantity);
                productPrice.put(name,price);

            }else{

                productMap.put(name, productMap.get(name) + quantity);
                productPrice.put(name,price);

            }

            input = scan.nextLine();

        }
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f\n",entry.getKey(),productPrice.get(entry.getKey()) * entry.getValue());
        }

    }
}
