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


                //•	"InsertSpace:|:{index}":
                //o	Inserts a single space at the given index. The given index will always be valid.

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

                //•	"Reverse:|:{substring}":
                //o	If the message contains the given substring, cut it out, reverse it
                // and add it at the end of the message.
                //o	If not, print "error".
                //o	This operation should replace only the first occurrence of the given substring if there are two or more occurrences.

            } else if (commands[0].equals("ChangeAll")) {

                String substring = commands[1];
                String replacement = commands[2];

                message = message.replaceAll(substring,replacement);




                //•	"ChangeAll:|:{substring}:|:{replacement}":
                //o	Changes all occurrences of the given substring with the replacement text.


            }
            System.out.println(message);


            input = scan.nextLine();
        }

        System.out.printf("You have a new text message: %s\n",message);
    }
}
