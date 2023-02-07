package TextProcessingLab;

import java.util.Scanner;

public class f02RepeatStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            int n = input[i].length();

            for (int j = 0; j < n; j++) {

                sb.append(input[i]);

            }
        }
        System.out.printf("%s\n", sb);
    }
}
