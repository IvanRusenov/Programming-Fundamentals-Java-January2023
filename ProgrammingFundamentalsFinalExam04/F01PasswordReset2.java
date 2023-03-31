package F04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class F01PasswordReset2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Done")) {

            String[] commands = input.split("\\s+");

            if (commands[0].equals("TakeOdd")) {

                StringBuilder sb = new StringBuilder();

                for (int i = 1; i < password.length(); i += 2) {

                    sb.append(password.charAt(i));

                }

                password = sb.toString();
                System.out.println(password);

            } else if (commands[0].equals("Cut")) {

                int index = Integer.parseInt(commands[1]);
                int length = Integer.parseInt(commands[2]);
                String substring = password.substring(index, index + length);
                password = password.replaceFirst(substring, "");
                System.out.println(password);

            } else if (commands[0].equals("Substitute")) {

                String substring = commands[1];
                String substitute = commands[2];

                if (password.contains(substring)) {

                    password = password.replace(substring, substitute);
                    System.out.println(password);

                } else {

                    System.out.println("Nothing to replace!");

                }

            }

            input = scan.nextLine();
        }

        System.out.printf("Your password is: %s", password);

    }

}

