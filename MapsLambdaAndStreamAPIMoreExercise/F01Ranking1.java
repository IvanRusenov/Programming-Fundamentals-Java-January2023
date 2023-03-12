package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class F01Ranking1 {
    public static class User {

        String name;
        Map<String, Integer> coursePointsMap = new LinkedHashMap<>();

        public User(String name, Map<String, Integer> coursePointsMap) {
            this.name = name;
            this.coursePointsMap = coursePointsMap;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Integer> getCoursePointsMap() {
            return coursePointsMap;
        }

        public void setCoursePointsMap(Map<String, Integer> coursePointsMap) {
            this.coursePointsMap = coursePointsMap;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, String> contestPasswordMap = new HashMap<>();

        while (!input.equals("end of contests")) {

            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestPasswordMap.put(contest, password);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        List<User> users = new ArrayList<>();

        while (!input.equals("end of submissions")) {

            String[] data = input.split("=>");
            String contest = data[0];
            String password = data[1];
            String name = data[2];
            int points = Integer.parseInt(data[3]);
            boolean isUserFound = false;

            if (contestPasswordMap.containsKey(contest) && contestPasswordMap.get(contest).equals(password)) {

                if (!users.isEmpty()) {

                    for (User user : users) {

                        if (user.getName().equals(name)) {

                            if (user.getCoursePointsMap().containsKey(contest)) {

                                if (user.getCoursePointsMap().get(contest) < points) {

                                    user.getCoursePointsMap().put(contest, points);

                                }

                            } else {

                                user.getCoursePointsMap().put(contest, points);

                            }
                            isUserFound = true;
                            break;

                        }

                    }

                    if (!isUserFound) {

                        User user1 = new User(name, new LinkedHashMap<>());
                        user1.getCoursePointsMap().put(contest, points);

                        users.add(user1);
                    }

                } else {

                    User user1 = new User(name, new LinkedHashMap<>());
                    user1.getCoursePointsMap().put(contest, points);

                    users.add(user1);

                }

            }

            input = scan.nextLine();
        }

        String bestCandidateName = "";
        int bestCandidatePoints = Integer.MIN_VALUE;

        for (User user : users) {

            int totalPoints = 0;

            for (Map.Entry<String, Integer> entry : user.getCoursePointsMap().entrySet()) {

                totalPoints += entry.getValue();

            }

            if (bestCandidatePoints < totalPoints) {

                bestCandidatePoints = totalPoints;
                bestCandidateName = user.getName();
            }

        }

        System.out.printf("Best candidate is %s with total %d points.\n", bestCandidateName, bestCandidatePoints);
        System.out.println("Ranking: ");

        users.stream().sorted(Comparator.comparing(User::getName))
                .forEach(user -> {

                    System.out.println(user.getName());
                    user.getCoursePointsMap().entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(entry -> System.out.printf("#  %s -> %d\n", entry.getKey(), entry.getValue()));

                });

    }
}

