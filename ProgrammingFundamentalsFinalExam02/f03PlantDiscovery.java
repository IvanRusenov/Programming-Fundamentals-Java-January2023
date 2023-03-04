package ProgrammingFundamentalsFinalExam02;

import java.util.*;

public class f03PlantDiscovery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        Map<String, List<Integer>> plantRatingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();

            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantsRarityMap.put(plant, rarity);
            plantRatingMap.putIfAbsent(plant, new ArrayList<>());

        }

        String input = scan.nextLine();

        while (!input.equals("Exhibition")) {

            String[] command = input.split("[: -]+");

            String plant = command[1];

            if (!plantsRarityMap.containsKey(plant)) {
                System.out.println("error");
                input = scan.nextLine();
                continue;
            }

            if (command[0].equals("Rate")) {

                int rating = Integer.parseInt(command[2]);

                plantRatingMap.get(plant).add(rating);

            } else if (command[0].equals("Update")) {

                int newRarity = Integer.parseInt(command[2]);

                plantsRarityMap.put(plant, newRarity);

            } else if (command[0].equals("Reset")) {

                plantRatingMap.get(plant).clear();

            }

            input = scan.nextLine();

        }

        System.out.println("Plants for the exhibition: ");

        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            double average = plantRatingMap.get(entry.getKey()).stream().mapToDouble(a -> a).average().orElse(0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), entry.getValue(), average);

        }
    }
}
