package ProgrammingFundamentalsFinalExamRetake01;

import java.util.Scanner;

public class f01TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Decode")){

           String[] command = input.split("\\|");

           if (command[0].startsWith("Move")){
               int n = Integer.parseInt(command[1]);
               //•	"Move {number of letters}":
               String substring = message.substring(0,n);
               message = message.replace(substring,"");
               message += substring;
//o	Moves the first n letters to the back of the string
           } else if (command[0].startsWith("Insert")) {
               int index = Integer.parseInt(command[1]);
               String value = command[2];
               //•	"Insert {index} {value}":
               String substring = message.substring(index);
               message = message.replace(substring,"");
               message += value + substring;
//o	Inserts the given value before the given index in the string
           } else if (command[0].startsWith("ChangeAll")) {
               String substring = command[1];
               String replacement = command[2];
               //•	"ChangeAll {substring} {replacement}":

               message = message.replace(substring,replacement);

//o	Changes all occurrences of the given substring with the replacement text
           }



            input = scan.nextLine();

        }
        System.out.printf("The decrypted message is: %s",message);
    }
}
