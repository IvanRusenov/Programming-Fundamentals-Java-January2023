package MethodsExercise;

import java.util.Scanner;

public class f09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        while  (!num.equals("END")){

            printResult(isPalindrome(num));

            num = scan.nextLine();
        }


    }
    public static boolean isPalindrome (String num){
        String numForward = "";

        for (int i = 0; i < num.length() ; i++) {
            numForward += "" + num.charAt(i);
        }
        String numBackward = "";
        for (int i = num.length() -1; i >= 0 ; i--) {
            numBackward += "" + num.charAt(i);
        }
        return numForward.equals(numBackward);
    }

    public static void printResult(boolean isPalindrome){
        System.out.println(isPalindrome);
    }
}
