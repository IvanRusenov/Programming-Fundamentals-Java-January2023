package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class F04Snowwhite {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Integer>> hatColorNamePhysics = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("Once upon a time")) {

            String[] data = input.split("\\s+<:>\\s+");
            String name = data[0];
            String hatColor = data[1];
            int physics = Integer.parseInt(data[2]);

            hatColorNamePhysics.putIfAbsent(hatColor, new TreeMap<>(Comparator.reverseOrder()));

            if (!hatColorNamePhysics.get(hatColor).containsKey(name)
                    || hatColorNamePhysics.get(hatColor).get(name) < physics) {

                hatColorNamePhysics.get(hatColor).put(name, physics);

            }

            input = scan.nextLine();

        }

        hatColorNamePhysics
                .entrySet()
                .stream()
                .sorted((f, s) -> {
                    int fSize = f.getValue().size();
                    int sSize = s.getValue().size();
                    int result = Integer.compare(sSize, fSize);
                    if (result == 0) {
                        int fMax = f.getValue().values().stream().mapToInt(i -> i).max().getAsInt();
                        int sMax = s.getValue().values().stream().mapToInt(i -> i).max().getAsInt();
                        result = Integer.compare(sMax, fMax);
                    }
                    return result;
                })
                .forEach(entry -> {

                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((f, s) -> Integer.compare(s.getValue(), f.getValue()))
                            .forEach(entry1 -> {
                                System.out.printf("(%s) %s <-> %d%n", entry.getKey(), entry1.getKey(), entry1.getValue());
                            });
                });
    }
}
