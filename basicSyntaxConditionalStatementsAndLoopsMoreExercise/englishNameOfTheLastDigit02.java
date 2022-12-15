package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class englishNameOfTheLastDigit02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        String lastDigit = "" + num.charAt(num.length()-1);
        if (lastDigit.equals("0")){
            System.out.println("zero");
        } else if (lastDigit.equals("1")) {
            System.out.println("one");
        } else if (lastDigit.equals("2")) {
            System.out.println("two");
        } else if (lastDigit.equals("3")) {
            System.out.println("three");
        } else if (lastDigit.equals("4")) {
            System.out.println("four");
        } else if (lastDigit.equals("5")) {
            System.out.println("five");
        } else if (lastDigit.equals("6")) {
            System.out.println("six");
        } else if (lastDigit.equals("7")) {
            System.out.println("seven");
        } else if (lastDigit.equals("8")) {
            System.out.println("eight");
        } else if (lastDigit.equals("9")) {
            System.out.println("nine");
        }
    }
}
