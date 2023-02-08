package TextProcessingLab;

import java.util.Scanner;

public class f04TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] bannedWords = scan.nextLine().split(", ");

        String text = scan.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < bannedWords[i].length(); j++) {
                sb.append("*");
            }

            while (text.contains(bannedWords[i])){

                text = text.replace(bannedWords[i],sb);
            }

        }

        System.out.println(text);

    }
}
