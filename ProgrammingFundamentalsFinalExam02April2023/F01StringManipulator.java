package ProgrammingFundamentalsFinalExam02April2023;

import java.util.Scanner;

public class F01StringManipulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("End")){

            String[] commands = input.split("\\s+");

            if (commands[0].equals("Translate")){

                String ch = commands[1];
                String replacement = commands[2];

                text = text.replace(ch,replacement);
                System.out.println(text);

            } else if (commands[0].equals("Includes")) {

                String substring = commands[1];

                if (text.contains(substring)){

                    System.out.println("True");

                }else {

                    System.out.println("False");

                }

            } else if (commands[0].equals("Start")) {

                String substring = commands[1];

                if (text.startsWith(substring)){

                    System.out.println("True");

                }else {

                    System.out.println("False");

                }

            }else if (commands[0].equals("Lowercase")) {

                text = text.toLowerCase();
                System.out.println(text);

            }else if (commands[0].equals("FindIndex")) {

                String ch = commands[1];

                System.out.println(text.lastIndexOf(ch));

            }else if (commands[0].equals("Remove")) {

                int start = Integer.parseInt(commands[1]);
                int length = Integer.parseInt(commands[2]);

                StringBuilder sb = new StringBuilder(text);
                sb.delete(start, start + length);
                text = sb.toString();

                System.out.println(text);

            }

            input = scan.nextLine();

        }

    }
}
