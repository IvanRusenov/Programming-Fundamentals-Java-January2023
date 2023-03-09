package ProgrammingFundamentalsFinalExam05;

import java.util.Scanner;

public class F01ActivationKeys {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String activationKey = scan.nextLine();
        String command = scan.nextLine();

        while(!command.equals("Generate")){

            String[] commands = command.split(">>>");

            if (commands[0].equals("Contains")){

                String substring = commands[1];

                if (activationKey.contains(substring)){

                    System.out.printf("%s contains %s\n",activationKey,substring);

                }else {

                    System.out.println("Substring not found!");

                }

            } else if (commands[0].equals("Flip")) {

                String upLocase = commands[1];
                int startIndex = Integer.parseInt(commands[2]);
                int endIndex = Integer.parseInt(commands[3]);

                StringBuilder sb = new StringBuilder(activationKey);
                String substring = "";

                if (upLocase.equals("Upper")){

                    substring = activationKey.substring(startIndex,endIndex).toUpperCase();

                } else {

                    substring = activationKey.substring(startIndex,endIndex).toLowerCase();

                }

                sb.delete(startIndex,endIndex);
                sb.insert(startIndex,substring);
                activationKey = sb.toString();
                System.out.println(activationKey);

            } else if (commands[0].equals("Slice")) {

                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);
                StringBuilder sb = new StringBuilder(activationKey);
                sb.delete(startIndex,endIndex);
                activationKey = sb.toString();
                System.out.println(activationKey);

            }

            command = scan.nextLine();

        }

        System.out.printf("Your activation key is: %s",activationKey);

    }
}
