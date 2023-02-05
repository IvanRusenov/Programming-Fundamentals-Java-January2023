package MidExamRetake1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03ManOWar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scan.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warship = Arrays.stream(scan.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        boolean isStalemate = true;

        while (!input.equals("Retire")) {

            String[] command = input.split(" ");

            if (command[0].equals("Fire")) {

                int index = Integer.parseInt(command[1]);
                int damage = Integer.parseInt(command[2]);

                if (index >= 0 && index < warship.size()) {

                    if (warship.get(index) - damage <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isStalemate = false;
                        break;
                    } else {

                        warship.set(index, warship.get(index) - damage);
                    }

                } else {

                    input = scan.nextLine();
                    continue;
                }

            } else if (command[0].equals("Defend")) {

                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                int damage = Integer.parseInt(command[3]);

                if (startIndex >= 0 && endIndex < pirateShip.size()) {

                    for (int i = startIndex; i <= endIndex; i++) {

                        if (pirateShip.get(i) - damage <= 0) {

                            System.out.println("You lost! The pirate ship has sunken.");
                            isStalemate = false;
                            break;

                        } else {

                            pirateShip.set(i, pirateShip.get(i) - damage);

                        }
                    }

                } else {

                    input = scan.nextLine();
                    continue;
                }

            } else if (command[0].equals("Repair")) {

                int index = Integer.parseInt(command[1]);
                int health = Integer.parseInt(command[2]);


                if (index >= 0 && index < pirateShip.size()) {

                    if (pirateShip.get(index) + health > maxHealth) {

                        pirateShip.set(index, maxHealth);

                    } else {

                        pirateShip.set(index, pirateShip.get(index) + health);
                    }

                } else {

                    input = scan.nextLine();
                    continue;
                }

            } else if (command[0].equals("Status")) {

                int count = 0;
                for (int item : pirateShip) {
                    if (item < maxHealth * 0.20) {
                        count++;
                    }
                }

                System.out.printf("%d sections need repair.\n", count);

            }

            input = scan.nextLine();
        }

        if (isStalemate) {
            int pirateStatus = pirateShip.stream().mapToInt(i -> i).sum();
            int warshipStatus = warship.stream().mapToInt(i -> i).sum();

            System.out.printf("Pirate ship status: %d\n", pirateStatus);
            System.out.printf("Warship status: %d\n", warshipStatus);
        }
    }
}
