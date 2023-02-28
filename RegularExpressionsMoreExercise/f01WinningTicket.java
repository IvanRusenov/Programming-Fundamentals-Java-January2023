package RegularExpressionsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class f01WinningTicket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> tickets = Arrays.stream(scan.nextLine().trim().split(",\\s+"))
                .collect(Collectors.toList());

        tickets.replaceAll(String::trim);

        for (String ticket : tickets) {

            if (ticket.length() == 20) {

                String leftHalf = ticket.substring(0, ticket.length() / 2);
                String rightHalf = ticket.substring(ticket.length() / 2);
                String findInLeft = "";
                String findInRight = "";
                boolean isMatch = false;

                String[] regexes = new String[]{"(\\@)\\1+", "(\\#)\\1+", "(\\$)\\1+", "(\\^)\\1+"};

                for (String regex : regexes) {

                    Pattern pattern = Pattern.compile(regex);
                    Matcher match = pattern.matcher(leftHalf);

                    while (match.find()) {

                        if (match.group().length() > findInLeft.length()) {
                            findInLeft = match.group();
                        }

                    }

                    if (!findInLeft.equals("")) {

                        match = pattern.matcher(rightHalf);

                        while (match.find()) {

                            if (match.group().length() > findInRight.length()) {
                                findInRight = match.group();
                            }

                        }

                        if (!findInRight.equals("")) {

                            if (findInLeft.length() > findInRight.length()) {

                                findInLeft = findInLeft.substring(0, findInRight.length());


                            } else {

                                findInRight = findInRight.substring(0, findInLeft.length());

                            }

                            if (findInLeft.equals(findInRight) && (findInLeft.length() >= 6
                                    && findInLeft.length() <= 10)) {

                                char symbol = regex.charAt(2);

                                if (findInLeft.length() == 10) {


                                    System.out.printf("ticket \"%s\" - %d%s Jackpot!\n"
                                            , ticket, findInLeft.length(), symbol);

                                } else {

                                    System.out.printf("ticket \"%s\" - %d%s\n"
                                            , ticket, findInLeft.length(), symbol);

                                }

                                isMatch = true;
                                break;

                            }

                        }

                    }

                }
                if (!isMatch) {

                    System.out.printf("ticket \"%s\" - no match\n", ticket);
                }

            } else {

                System.out.println("invalid ticket");

            }
        }
    }
}



