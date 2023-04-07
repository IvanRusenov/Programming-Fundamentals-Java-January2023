package F03ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class F01SecretChat2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Reveal")) {

            String[] instructions = input.split(":\\|:");

            if (instructions[0].equals("InsertSpace")) {

                int index = Integer.parseInt(instructions[1]);
                StringBuilder sb = new StringBuilder(message);
                message = sb.insert(index, " ").toString();
                System.out.println(message);

            } else if (instructions[0].equals("Reverse")) {

                String substring = instructions[1];

                if (message.contains(substring)) {

                    StringBuilder sb = new StringBuilder(message);
                    message = sb.delete(message.indexOf(substring), message.indexOf(substring) + substring.length()).toString();
                    sb = new StringBuilder(substring);
                    substring = sb.reverse().toString();
                    sb = new StringBuilder(message);


                    message = sb.append(substring).toString();
                    System.out.println(message);

                } else {

                    System.out.println("error");

                }

            } else if (instructions[0].equals("ChangeAll")) {

                String substring = instructions[1];
                String replacement = instructions[2];

                message = message.replace(substring, replacement);
                System.out.println(message);

            }

            input = scan.nextLine();

        }

        System.out.printf("You have a new text message: %s\n", message);
    }
}
