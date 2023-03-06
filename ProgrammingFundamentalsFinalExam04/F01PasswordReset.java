package ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;

public class F01PasswordReset {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        String command = scan.nextLine();

        while (!command.equals("Done")) {

            if (command.startsWith("TakeOdd")) {

                for (int i = 1; i < password.length(); i += 2) {

                    sb.append(password.charAt(i));

                }

                password = sb.toString();
                System.out.println(password);

            } else if (command.startsWith("Cut")) {

                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);

                String sub = password.substring(index, (index + length));
                password = password.replaceFirst(sub, "");
                System.out.println(password);

            } else if (command.startsWith("Substitute")) {

                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];

                if (password.contains(substring)) {

                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);

                } else {

                    System.out.println("Nothing to replace!");

                }

            }

            command = scan.nextLine();

        }

        System.out.printf("Your password is: %s", password);
    }
}
