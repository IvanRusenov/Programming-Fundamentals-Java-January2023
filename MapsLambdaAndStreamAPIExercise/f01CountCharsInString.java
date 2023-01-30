package MapsLambdaAndStreamAPIExercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class f01CountCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] words = scan.nextLine().split(" ");

        Map <Character,Integer> charMap = new LinkedHashMap<>();

        for (String word : words) {

            char[] symbols = word.toCharArray();

            for (Character symbol: symbols) {

                if (!charMap.containsKey(symbol)){
                    charMap.put(symbol,1);

                }else {
                    charMap.put(symbol, charMap.get(symbol) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
        }


    }
}
