package ProgrammingFundamentalsFinalExam05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class F03PIrates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Integer> citiesPopulation = new LinkedHashMap<>();
        Map<String, Integer> citiesGold = new LinkedHashMap<>();

        while (!input.equals("Sail")) {

            String city = input.split("\\|{2}")[0];
            int population = Integer.parseInt(input.split("\\|{2}")[1]);
            int gold = Integer.parseInt(input.split("\\|{2}")[2]);

            if (!citiesPopulation.containsKey(city)) {

                citiesPopulation.put(city, population);
                citiesGold.put(city, gold);

            } else {

                citiesPopulation.put(city, citiesPopulation.get(city) + population);
                citiesGold.put(city, citiesGold.get(city) + gold);

            }

            input = scan.nextLine();

        }

        input = scan.nextLine();

        while (!input.equals("End")) {

            String[] events = input.split("=>");

            String event = events[0];
            String town = events[1];

            if (event.equals("Plunder")) {

                int people = Integer.parseInt(events[2]);
                int gold = Integer.parseInt(events[3]);

                citiesPopulation.put(town, citiesPopulation.get(town) - people);
                citiesGold.put(town, citiesGold.get(town) - gold);
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);

                if (citiesPopulation.get(town) <= 0 || citiesGold.get(town) <= 0) {

                    System.out.printf("%s has been wiped off the map!\n", town);
                    citiesPopulation.remove(town);
                    citiesGold.remove(town);
                }

            } else if (event.equals("Prosper")) {

                int gold = Integer.parseInt(events[2]);

                if (gold < 0) {

                    System.out.println("Gold added cannot be a negative number!");

                } else {

                    citiesGold.put(town, citiesGold.get(town) + gold);
                    System.out.printf("%s gold added to the city treasury. %s now has %d gold.\n"
                            , gold, town, citiesGold.get(town));

                }

            }

            input = scan.nextLine();

        }

        if (citiesPopulation.isEmpty()) {

            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        } else {

            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", citiesPopulation.size());
            for (Map.Entry<String, Integer> entry : citiesPopulation.entrySet()) {

                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n"
                        , entry.getKey(), entry.getValue(), citiesGold.get(entry.getKey()));

            }

        }

    }
}

