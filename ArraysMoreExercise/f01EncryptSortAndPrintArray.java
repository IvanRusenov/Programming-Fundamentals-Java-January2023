package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] allCodes = new int[n];
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            int code = 0;
            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i' ||
                    letter == 'A' || letter == 'O' || letter == 'U' || letter == 'E' || letter == 'I') {
                    code += letter * word.length();
                } else {
                    code += letter / word.length();
                }
            }
            allCodes[i] = code;
        }
        Arrays.sort(allCodes);
        for (int i = 0; i < allCodes.length ; i++) {
            System.out.printf("%d\n", allCodes[i]);
        }


    }
}
