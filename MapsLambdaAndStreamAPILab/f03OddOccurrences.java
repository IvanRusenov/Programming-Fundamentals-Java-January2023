package MapsLambdaAndStreamAPLab;

import java.util.*;

public class f03OddOccurrences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().toLowerCase().split(" ");

        LinkedHashMap <String,Integer> wordsLHM = new LinkedHashMap<>();


        for (String word:words) {


            if (!wordsLHM.containsKey(word)){

                wordsLHM.put(word,0);
            }

            wordsLHM.put(word,wordsLHM.get(word) + 1);

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsLHM.entrySet()) {
            if (entry.getValue()%2 != 0){

                result.add(entry.getKey());

            }


        }
        System.out.printf("%s",String.join(", ",result));

    }
}
