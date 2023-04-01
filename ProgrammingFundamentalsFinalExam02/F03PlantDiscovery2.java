package F02ProgrammingFundamentalsFinalExam;

import java.util.*;

public class F03PlantDiscovery2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> plantRatingMap = new LinkedHashMap<>();

        while (n-- > 0) {

            String input = scan.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantRarityMap.put(plant, rarity);
            plantRatingMap.put(plant, new ArrayList<>());

        }

        String input = scan.nextLine();

        while (!input.equals("Exhibition")) {

            String command = input.split(":\\s+")[0];
            String[] data = input.split(":\\s+")[1].split("\\s+-\\s+");
            String plant = data[0];

            if (plantRatingMap.containsKey(plant)) {

                if (command.equals("Rate")) {

                    double rating = Double.parseDouble(data[1]);
                    plantRatingMap.get(plant).add(rating);

                } else if (command.equals("Update")) {

                    int newRarity = Integer.parseInt(data[1]);

                    plantRarityMap.put(plant, newRarity);

                } else if (command.equals("Reset")) {

                    plantRatingMap.get(plant).clear();

                }

            } else {

                System.out.println("error");

            }

            input = scan.nextLine();

        }

        System.out.println("Plants for the exhibition:");

        plantRarityMap.forEach((k, v) -> {

            double avg = plantRatingMap.get(k).stream().mapToDouble(i -> i).average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", k, v, avg);

        });

    }
}
