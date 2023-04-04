package F03ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class F03NeedFoSpeedIII2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, int[]> carMileageFuelMap = new LinkedHashMap<>();

        while (n-- > 0) {

            String[] input = scan.nextLine().split("\\|");

            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            carMileageFuelMap.putIfAbsent(car, new int[2]);
            carMileageFuelMap.get(car)[0] = mileage;
            carMileageFuelMap.get(car)[1] = fuel;

        }

        String input = scan.nextLine();

        while (!input.equals("Stop")) {

            String[] commands = input.split("\\s+:\\s+");

            String command = commands[0];
            String car = commands[1];

            if (command.equals("Drive")) {

                int distance = Integer.parseInt(commands[2]);
                int fuel = Integer.parseInt(commands[3]);

                if (carMileageFuelMap.get(car)[1] >= fuel) {

                    carMileageFuelMap.get(car)[1] -= fuel;
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);
                    carMileageFuelMap.get(car)[0] += distance;

                    if (carMileageFuelMap.get(car)[0] >= 100000) {

                        System.out.printf("Time to sell the %s!\n", car);
                        carMileageFuelMap.remove(car);

                    }

                } else {

                    System.out.println("Not enough fuel to make that ride");

                }

            } else if (command.equals("Refuel")) {

                int fuel = Integer.parseInt(commands[2]);

                if (carMileageFuelMap.get(car)[1] + fuel > 75) {

                    System.out.printf("%s refueled with %d liters\n", car, 75 - carMileageFuelMap.get(car)[1]);
                    carMileageFuelMap.get(car)[1] = 75;

                } else {

                    carMileageFuelMap.get(car)[1] += fuel;
                    System.out.printf("%s refueled with %d liters\n", car, fuel);

                }

            } else if (command.equals("Revert")) {

                int kilometers = Integer.parseInt(commands[2]);


                if (carMileageFuelMap.get(car)[0] - kilometers <= 10000) {

                    carMileageFuelMap.get(car)[0] = 10000;

                } else {

                    carMileageFuelMap.get(car)[0] -= kilometers;
                    System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);

                }

            }

            input = scan.nextLine();

        }

        carMileageFuelMap
                .forEach((k, v) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", k, v[0], v[1]));

    }
}
