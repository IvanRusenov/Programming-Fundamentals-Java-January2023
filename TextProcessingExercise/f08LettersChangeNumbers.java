package TextProcessingExercise;

import java.util.Scanner;

public class f08LettersChangeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double totalSum = 0;


        for (String s : input) {

            StringBuilder sb = new StringBuilder(s);
            char beforeNum = sb.charAt(0);
            char afterNum = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
            int num = Integer.parseInt(sb.toString());


            if (beforeNum >= 'a' && beforeNum <= 'z') {
                totalSum += 1.0 * num * (beforeNum - 96);
            } else {
                totalSum += 1.0 * num / (beforeNum - 64);
            }


            if (afterNum >= 'a' && afterNum <= 'z') {
                totalSum += (afterNum - 96);
            } else {
                totalSum -= (afterNum - 64);
            }

        }

        System.out.printf("%.2f", totalSum);
    }
}
