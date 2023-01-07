package MethodsExercise;

import java.util.Scanner;

public class f03CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);

        printBetweenTwoChars(firstChar,secondChar);
    }

    public static void printBetweenTwoChars(char ch1, char ch2){

        char start = ch1;
        char end = ch2;

        if (ch1 > ch2){
           start = ch2;
           end = ch1;
        }

            start = (char)(start +1);

        for (char i  = start ; i < end ; i++) {
            System.out.printf("%c ",i);
        }

    }

}
