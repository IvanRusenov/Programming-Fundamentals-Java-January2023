package TextProcessingLab;

import java.util.Scanner;

public class f05DigitsLettersAndOther2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (char ch : input) {
            if (Character.isDigit(ch)){
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (!Character.isLetterOrDigit(ch)) {
                symbols.append(ch);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);


    }
}
