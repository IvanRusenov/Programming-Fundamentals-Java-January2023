package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class F03MOBAChallenger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Map<String, Integer>> playerPositionSkillMap = new TreeMap<>();

        while (!input.equals("Season end")) {


            if (input.contains(" -> ")) {

                String[] data = input.split("\\s+->\\s+");

                String player = data[0];
                String position = data[1];
                int skill = Integer.parseInt(data[2]);

                if (!playerPositionSkillMap.containsKey(player)) {

                    playerPositionSkillMap.put(player, new LinkedHashMap<>());
                    playerPositionSkillMap.get(player).put(position, skill);

                } else {

                    if (!playerPositionSkillMap.get(player).containsKey(position)) {

                        playerPositionSkillMap.get(player).put(position, skill);

                    } else {

                        if (playerPositionSkillMap.get(player).get(position) < skill) {

                            playerPositionSkillMap.get(player).put(position, skill);

                        }
                    }
                }


            } else {


                String[] data = input.split("\\s+vs\\s+");

                String player1 = data[0];
                String player2 = data[1];
                boolean isValidDuel = false;

                if (playerPositionSkillMap.containsKey(player1) && playerPositionSkillMap.containsKey(player2)) {

                    int player1TotalPoints = playerPositionSkillMap.get(player1).values().stream().mapToInt(i -> i).sum();
                    int player2TotalPoints = playerPositionSkillMap.get(player2).values().stream().mapToInt(i -> i).sum();


                    for (Map.Entry<String, Integer> entry1 : playerPositionSkillMap.get(player1).entrySet()) {

                        if (isValidDuel) {

                            break;

                        }

                        for (Map.Entry<String, Integer> entry2 : playerPositionSkillMap.get(player2).entrySet()) {

                            if (entry1.getKey().equals(entry2.getKey())) {

                                if (player1TotalPoints > player2TotalPoints) {

                                    playerPositionSkillMap.remove(player2);

                                } else if (player1TotalPoints < player2TotalPoints) {

                                    playerPositionSkillMap.remove(player1);

                                }

                                isValidDuel = true;
                                break;

                            }

                        }

                    }

                }

            }

            input = scan.nextLine();

        }

        Comparator<Map.Entry<String, Integer>> customComparator = (f, s) -> {

            int result = Integer.compare(s.getValue(), f.getValue());

            if (result == 0) {

                result = f.getKey().compareTo(s.getKey());

            }

            return result;

        };

        playerPositionSkillMap.entrySet().stream().sorted((f, s) -> {

            int firstPoints = f.getValue().values().stream().mapToInt(i -> i).sum();
            int secondPoints = s.getValue().values().stream().mapToInt(i -> i).sum();

            int result = Integer.compare(secondPoints, firstPoints);

            if (result == 0) {

                result = f.getKey().compareTo(s.getKey());

            }

            return result;

        }).forEach(entry -> {

            int points = entry.getValue().values().stream().mapToInt(i -> i).sum();

            System.out.printf("%s: %d skill\n", entry.getKey(), points);

            entry.getValue()
                    .entrySet()
                    .stream()
                    .sorted(customComparator)
                    .forEach(el -> {
                        System.out.printf("- %s <::> %d\n", el.getKey(), el.getValue());
                    });
        });

    }
}



