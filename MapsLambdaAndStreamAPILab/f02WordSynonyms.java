package MapsLambdaAndStreamAPLab;

import java.util.*;

public class f02WordSynonyms {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, ArrayList<String>> wordsLinkedHashMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!wordsLinkedHashMap.containsKey(word)){

                wordsLinkedHashMap.put(word,new ArrayList<>());

            }
            //!!! get(key).add(value) !!!
            wordsLinkedHashMap.get(word).add(synonym);

        }
        for (Map.Entry<String,ArrayList<String>> entry : wordsLinkedHashMap.entrySet()){

            System.out.printf("%s - %s\n",entry.getKey(),String.join(", ",entry.getValue()));
        }

    }

}

