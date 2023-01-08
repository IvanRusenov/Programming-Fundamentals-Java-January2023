package MethodsExercise;

import java.util.Scanner;

public class f06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        getMiddleChar(input);

    }
        public static void getMiddleChar(String text){

        if (text.length() % 2 == 0){
            char symbol1 = text.charAt(text.length()/2 - 1) ;
            char symbol2 = text.charAt(text.length()/2);
            System.out.printf("%c%c",symbol1,symbol2);
        }else{
            char middle = text.charAt(text.length() / 2);
            System.out.println(middle);
        }


        }
}
