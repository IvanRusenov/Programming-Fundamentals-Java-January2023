package ProgrammingFundamentalsFinalExamRetake03;

import java.util.Scanner;

public class F01SecretChat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Reveal")){

            String[] commands = input.split(":\\|:");

            if (commands[0].equals("InsertSpace")){

                StringBuilder sb = new StringBuilder(message);

                int index = Integer.parseInt(commands[1]);

                sb.insert(index," ");
                message = sb.toString();
               
            } else if (commands[0].equals("Reverse")) {

                String substring = commands[1];

                if (message.contains(substring)){

                    StringBuilder sb = new StringBuilder(substring);
                    message = message.replaceFirst(substring,"");
                    substring =  sb.reverse().toString();
                    sb = new StringBuilder(message);
                    sb.append(substring);
                    message = sb.toString();


                }else {

                    System.out.println("error");
                    input = scan.nextLine();
                    continue;

                }

            } else if (commands[0].equals("ChangeAll")) {

                String substring = commands[1];
                String replacement = commands[2];

                message = message.replaceAll(substring,replacement);

            }
            System.out.println(message);

            input = scan.nextLine();
        }

        System.out.printf("You have a new text message: %s\n",message);
    }
}
