package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class f02Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> participants = Arrays.stream(input.split(", ")).collect(Collectors.toList());

        Map<String,Integer> participant = new LinkedHashMap<>();


        input = scan.nextLine();
        while (!input.equals("end of race")) {

            Pattern patternName = Pattern.compile("[A-Za-z]");
            Pattern patternDistance = Pattern.compile("[0-9]");

            Matcher matcherName = patternName.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();

            while (matcherName.find()){
                nameBuilder.append(matcherName.group());
            }
            String name = nameBuilder.toString();
            Matcher matcherDistance = patternDistance.matcher(input);
            int distance = 0;

            while (matcherDistance.find()){

                distance += Integer.parseInt(matcherDistance.group());
            }

            if (participants.contains(name)){

                if (!participant.containsKey(name)){

                    participant.put(name,distance);

                }else {

                    participant.put(name, participant.get(name) + distance);
                }

            }

            input = scan.nextLine();

        }

        Map<String, Integer> sortedParticipant = participant.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        List<String> winners = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : sortedParticipant.entrySet()) {


            winners.add(entry.getKey());

        }

        System.out.printf("1st place: %s\n2nd place: %s\n3rd place: %s\n",winners.get(0),winners.get(1),winners.get(2));

    }

}