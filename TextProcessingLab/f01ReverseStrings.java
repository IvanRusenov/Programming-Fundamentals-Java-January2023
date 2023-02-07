package TextProcessingLab;

import java.util.Scanner;

public class f01ReverseStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input =scan.nextLine();

        while (!input.equals("end")){

            StringBuilder sb = new StringBuilder();

            for (int i = input.length()-1; i >= 0 ; i--) {
                sb.append(input.charAt(i));
            }
            System.out.printf("%s = %s\n",input,sb);


            input = scan.nextLine();

        }
    }
}
