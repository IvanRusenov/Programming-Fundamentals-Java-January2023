package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class F02Judge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Map<String, Integer>> contestUserPoints = new LinkedHashMap<>();

        while (!input.equals("no more time")) {

            String[] data = input.split("\\s+->\\s+");

            String userName = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            if (contestUserPoints.containsKey(contest)) {

                if (contestUserPoints.get(contest).containsKey(userName)) {

                    if (contestUserPoints.get(contest).get(userName) < points) {

                        contestUserPoints.get(contest).put(userName, points);

                    }

                } else {

                    contestUserPoints.get(contest).put(userName, points);

                }

            } else {

                contestUserPoints.put(contest, new TreeMap<>());
                contestUserPoints.get(contest).put(userName, points);

            }

            input = scan.nextLine();

        }

        contestUserPoints.forEach((key, value) -> {

            System.out.printf("%s: %d participants\n", key, value.size());
            AtomicInteger counter = new AtomicInteger(1);

            value.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(entry -> System.out.printf("%d. %s <::> %d\n"
                            , counter.getAndIncrement()
                            , entry.getKey()
                            , entry.getValue()));

        });

        Map<String, Integer> participants = new TreeMap<>();

        contestUserPoints.forEach((key, value) -> value.forEach((k, v) -> {

            if (!participants.containsKey(k)) {

                participants.put(k, v);

            } else {

                participants.put(k, participants.get(k) + v);

            }
        }));

        System.out.println("Individual standings:");
        AtomicInteger counter = new AtomicInteger(1);

        participants.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.printf("%d. %s -> %d\n"
                        , counter.getAndIncrement()
                        , entry.getKey()
                        , entry.getValue()));

    }
}
