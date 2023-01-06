package MethodsExercise;

import java.util.Scanner;

public class f02VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        countVowels(input);

    }
    public static void countVowels(String text){
        text = text.toLowerCase();
        int vowelsCount = 0;
        char[] vowels = new char[] {'a','o','u','e','i'};
        for (int i = 0; i < text.length(); i++) {
            for (char letter : vowels) {
                if (text.charAt(i) == letter){
                    vowelsCount++;
                }
            }
        }
        System.out.println(vowelsCount);
    }
}
