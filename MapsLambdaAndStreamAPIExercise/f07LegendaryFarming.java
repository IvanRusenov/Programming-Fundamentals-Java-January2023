package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f07LegendaryFarming {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> itemsMap = new LinkedHashMap<>();
        boolean isObtayned = false;
        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();

        while (!isObtayned) {

            String[] input = scan.nextLine().split(" ");

            label:
            for (int i = 0; i < input.length - 1; i += 2) {

                int count = Integer.parseInt(input[i]);
                String item = input[i + 1].toLowerCase();

                switch (item) {
                    case "shards":

                        if (!itemsMap.containsKey(item)) {
                            itemsMap.put(item, count);
                        } else {
                            itemsMap.put(item, itemsMap.get(item) + count);

                        }
                        if (itemsMap.get(item) >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            itemsMap.put(item, itemsMap.get(item) - 250);
                            isObtayned = true;
                            break label;
                        }


                        break;
                    case "fragments":

                        if (!itemsMap.containsKey(item)) {
                            itemsMap.put(item, count);
                        } else {
                            itemsMap.put(item, itemsMap.get(item) + count);

                        }
                        if (itemsMap.get(item) >= 250) {

                            System.out.println("Valanyr obtained!");
                            itemsMap.put(item, itemsMap.get(item) - 250);
                            isObtayned = true;
                            break label;
                        }


                        break;
                    case "motes":

                        if (!itemsMap.containsKey(item)) {
                            itemsMap.put(item, count);
                        } else {
                            itemsMap.put(item, itemsMap.get(item) + count);

                        }
                        if (itemsMap.get(item) >= 250) {
                            System.out.println("Dragonwrath obtained!");
                            itemsMap.put(item, itemsMap.get(item) - 250);
                            isObtayned = true;
                            break label;
                        }

                        break;
                    default:

                        if (!junkMap.containsKey(item)) {
                            junkMap.put(item, count);
                        } else {
                            junkMap.put(item, junkMap.get(item) + count);

                        }
                        break;
                }
            }
        }

        if (itemsMap.containsKey("shards")) {
            System.out.printf("shards: %d\n", itemsMap.get("shards"));
        } else {
            System.out.print("shards: 0\n");
        }
        if (itemsMap.containsKey("fragments")) {
            System.out.printf("fragments: %d\n", itemsMap.get("fragments"));
        } else {
            System.out.print("fragments: 0\n");
        }
        if (itemsMap.containsKey("motes")) {
            System.out.printf("motes: %d\n", itemsMap.get("motes"));
        } else {
            System.out.print("motes: 0\n");
        }


        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }
}