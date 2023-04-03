package ProgrammingFundamentalsRetakeExamPart16January2017;

import java.util.*;
import java.util.stream.Collectors;

public class F02SoftUniKaraoke {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> participants = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        List<String> songs = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());

        String awards = scan.nextLine();

        Map<String, List<String>> awardedAwardMap = new LinkedHashMap<>();

        while (!awards.equals("dawn")){

            String [] awardsData = awards.split(",\\s+");
            String awarded = awardsData[0];
            String song = awardsData[1];
            String award = awardsData[2];

            if (participants.contains(awarded) && songs.contains(song)){

                awardedAwardMap.putIfAbsent(awarded, new ArrayList<>());

                if (!awardedAwardMap.get(awarded).contains(award)){

                    awardedAwardMap.get(awarded).add(award);
                    Collections.sort(awardedAwardMap.get(awarded));

                }

            }

            awards = scan.nextLine();
        }

        if (awardedAwardMap.size()!=0){

            awardedAwardMap.entrySet()
                    .stream()
                    .sorted((f,s)->{

                        int result = Integer.compare(s.getValue().size(),f.getValue().size());
                        if (result==0){
                            result = f.getKey().compareTo(s.getKey());
                        }
                        return result;
                    })
                    .forEach(entry -> {

                        System.out.printf("%s: %d awards\n", entry.getKey(), entry.getValue().size());
                        entry.getValue().forEach(e-> System.out.printf("--%s\n",e));

                    });

        } else {

            System.out.println("No awards");

        }

    }
}
