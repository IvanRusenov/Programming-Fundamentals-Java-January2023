package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f03TreasureFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] key = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scan.nextLine();

        while(!input.equals("find")){

            int keyLength = key.length;
            int inputLength = input.length();
            StringBuilder sb = new StringBuilder();

            if (keyLength<inputLength){

                for (int i = 0; i < inputLength; i++) {



                        sb.append((char)(input.charAt(i) - key[i % keyLength]));


                }

            }
            Pattern pattern = Pattern.compile("&(?<type>\\w+)&(.*)<(?<coordinates>\\w+)>");
            Matcher matcher = pattern.matcher(sb);

            if (matcher.find()){
                System.out.printf("Found %s at %s\n",matcher.group("type"),matcher.group("coordinates"));
            }

            input = scan.nextLine();

        }
    }
}
