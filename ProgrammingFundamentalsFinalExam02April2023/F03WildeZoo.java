package ProgrammingFundamentalsFinalExam02April2023;

import java.util.*;

public class WildeZoo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> areaAnimalsMap = new LinkedHashMap<>();
        Map<String, Integer> animalFoodMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("EndDay")) {

            String[] data = input.split(":\\s+");
            String[] commands = data[1].split("-");
            String animal = commands[0];

            if (data[0].equals("Add")) {

                int foodNeeded = Integer.parseInt(commands[1]);
                String area = commands[2];

                animalFoodMap.putIfAbsent(animal, 0);
                animalFoodMap.put(animal, animalFoodMap.get(animal) + foodNeeded);
                areaAnimalsMap.putIfAbsent(area, new ArrayList<>());

                if (!areaAnimalsMap.get(area).contains(animal)) {

                    areaAnimalsMap.get(area).add(animal);

                }

            } else if (data[0].equals("Feed")) {

                int food = Integer.parseInt(commands[1]);

                if (animalFoodMap.containsKey(animal)) {

                    if (animalFoodMap.get(animal) - food <= 0) {

                        System.out.printf("%s was successfully fed\n", animal);

                        for (Map.Entry<String, List<String>> entry : areaAnimalsMap.entrySet()) {

                            if (entry.getValue().contains(animal)) {

                                entry.getValue().remove(animal);

                            }
                        }

                        animalFoodMap.remove(animal);

                    } else {

                        animalFoodMap.put(animal, animalFoodMap.get(animal) - food);
                    }
                }

            }

            input = scan.nextLine();
        }

        System.out.println("Animals:");

        animalFoodMap.forEach((k, v) -> {

            System.out.printf(" %s -> %dg\n", k, v);

        });

        System.out.println("Areas with hungry animals:");

        areaAnimalsMap.forEach((k, v) -> {

            if (v.size() > 0) {

                System.out.printf(" %s: %d\n", k, v.size());

            }

        });

    }
}
