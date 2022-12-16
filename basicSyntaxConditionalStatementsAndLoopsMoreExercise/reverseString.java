package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String  reversed ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
