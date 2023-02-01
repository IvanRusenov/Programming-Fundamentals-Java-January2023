package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class f09ForceBook {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> forceSideMap = new LinkedHashMap<>();
        String input = scan.nextLine();
        String forceSide = "";
        String forceUser = "";

        while (!input.equals("Lumpawaroo")) {

            String[] data = input.split(" \\| ");

            if (data[0].contains("->")) {

                String[] data2 = data[0].split(" -> ");

                forceUser = data2[0];
                forceSide = data2[1];

                for (Map.Entry<String, List<String>> entry : forceSideMap.entrySet()) {

                    if (entry.getValue().contains(forceUser)) {
                        entry.getValue().remove(forceUser);
                    }
                }

                if (forceSideMap.containsKey(forceSide)) {

                    forceSideMap.get(forceSide).add(forceUser);

                } else {
                    forceSideMap.put(forceSide, new ArrayList<>());
                    forceSideMap.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);

            } else {
                forceSide = data[0];
                forceUser = data[1];

                if (!forceSideMap.containsKey(forceSide)) {

                    forceSideMap.put(forceSide, new ArrayList<>());

                }

                if (!forceSideMap.get(forceSide).contains(forceUser)) {

                    forceSideMap.get(forceSide).add(forceUser);
                }

                System.out.println();

            }

            input = scan.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : forceSideMap.entrySet()) {

            if (entry.getValue().size() > 0) {

                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());


                for (String item : entry.getValue()) {
                    System.out.printf("! %s\n", item);
                }

            }
        }
    }
}
