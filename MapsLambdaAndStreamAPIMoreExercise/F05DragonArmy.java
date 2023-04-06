package MapsLambdaAndStreamAPIMoreExercise;
import java.util.*;

public class F05DragonArmy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\s+");
            String type = input[0];
            String name = input[1];
            int damage = parseOrDefault(input[2], 45);
            int health = parseOrDefault(input[3], 250);
            int armor = parseOrDefault(input[4], 10);

            dragons.computeIfAbsent(type, k -> new TreeMap<>())
                    .put(name, new int[]{damage, health, armor});
        }

        dragons.forEach((type, typeDragons) -> {

            double avgDamage = typeDragons.values().stream().mapToInt(dragon -> dragon[0]).average().orElse(0);
            double avgHealth = typeDragons.values().stream().mapToInt(dragon -> dragon[1]).average().orElse(0);
            double avgArmor = typeDragons.values().stream().mapToInt(dragon -> dragon[2]).average().orElse(0);

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", type, avgDamage, avgHealth, avgArmor);

            typeDragons.forEach((name, stats) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n"
                    , name, stats[0], stats[1], stats[2]));

        });
    }

    private static int parseOrDefault(String value, int defaultValue) {
        return value.equals("null") ? defaultValue : Integer.parseInt(value);
    }
}
