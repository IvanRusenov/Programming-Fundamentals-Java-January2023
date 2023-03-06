package ProgrammingFundamentalsFinalExamRetake03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class F03NeedForSpeedIII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();

            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);

            carMileage.put(car, mileage);
            carFuel.put(car, fuel);

        }

        String input = scan.nextLine();

        while (!input.equals("Stop")) {

            String[] command = input.split("\\s+:\\s+");
            String car = command[1];

            if (carMileage.containsKey(car)) {

                if (command[0].equals("Drive")) {

                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);

                    if (carFuel.get(car) <= fuel) {

                        System.out.println("Not enough fuel to make that ride");

                    } else {

                        carFuel.put(car, carFuel.get(car) - fuel);
                        carMileage.put(car, carMileage.get(car) + distance);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n"
                                , car, distance, fuel);

                        if (carMileage.get(car) >= 100000) {

                            System.out.printf("Time to sell the %s!\n",car);
                            carMileage.remove(car);
                            carFuel.remove(car);

                        }

                    }

                } else if (command[0].equals("Refuel")) {

                    int fuel = Integer.parseInt(command[2]);

                    if (carFuel.get(car) + fuel > 75) {

                        System.out.printf("%s refueled with %d liters\n", car, 75 - carFuel.get(car));
                        carFuel.put(car, 75);

                    } else {

                        carFuel.put(car, carFuel.get(car) + fuel);
                        System.out.printf("%s refueled with %d liters\n", car, fuel);

                    }

                } else if (command[0].equals("Revert")) {

                    int distance = Integer.parseInt(command[2]);

                    if (carMileage.get(car) - distance <= 10000) {

                        carMileage.put(car, 10000);

                    } else {

                        carMileage.put(car, carMileage.get(car) - distance);
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, distance);
                    }

                }

            }

            input = scan.nextLine();


        }

        for (Map.Entry<String, Integer> entry : carMileage.entrySet()) {

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
                    , entry.getKey(), entry.getValue(), carFuel.get(entry.getKey()));

        }

    }
}
