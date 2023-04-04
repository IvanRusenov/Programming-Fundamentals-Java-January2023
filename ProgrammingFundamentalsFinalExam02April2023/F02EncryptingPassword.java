package ProgrammingFundamentalsFinalExam02April2023;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02EncryptingPassword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile("(.+)>(?<digits>\\d{3})\\|(?<lowLetters>[a-z]{3})\\|(?<upLetters>[A-Z]{3})\\|(?<symbols>[^<>]{3})<\\1");

        while (n-- > 0) {

            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            String password = "";

            if (matcher.find()) {

                password = matcher.group("digits") + matcher.group("lowLetters") +
                        matcher.group("upLetters") + matcher.group("symbols");

                System.out.printf("Password: %s\n", password);

            } else {

                System.out.println("Try another password!");
            }

        }

    }
}
