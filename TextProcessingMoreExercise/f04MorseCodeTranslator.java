package TextProcessingMoreExercise;

import java.util.Scanner;

public class f04MorseCodeTranslator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] morseCode = input.split("\\s+");
        

        for (int i = 0; i < morseCode.length; i++) {
            
            if (morseCode[i].equals(".-")){
                sb.append('A');
            } else if (morseCode[i].equals("-...")) {
                sb.append('B');
            }else if (morseCode[i].equals("-.-.")) {
                sb.append('C');
            }else if (morseCode[i].equals("-..")) {
                sb.append('D');
            }else if (morseCode[i].equals(".")) {
                sb.append('E');
            }else if (morseCode[i].equals("..-.")) {
                sb.append('F');
            }else if (morseCode[i].equals("--.")) {
                sb.append('G');
            }else if (morseCode[i].equals("....")) {
                sb.append('H');
            }else if (morseCode[i].equals("..")) {
                sb.append('I');
            }else if (morseCode[i].equals(".---")) {
                sb.append('J');
            }else if (morseCode[i].equals("-.-")) {
                sb.append('K');
            }else if (morseCode[i].equals(".-..")) {
                sb.append('L');
            }else if (morseCode[i].equals("--")) {
                sb.append('M');
            }else if (morseCode[i].equals("-.")) {
                sb.append('N');
            }else if (morseCode[i].equals("---")) {
                sb.append('O');
            }else if (morseCode[i].equals(".--.")) {
                sb.append('P');
            }else if (morseCode[i].equals("--.-")) {
                sb.append('Q');
            }else if (morseCode[i].equals(".-.")) {
                sb.append('R');
            }else if (morseCode[i].equals("...")) {
                sb.append('S');
            }else if (morseCode[i].equals("-")) {
                sb.append('T');
            }else if (morseCode[i].equals("..-")) {
                sb.append('U');
            }else if (morseCode[i].equals("...-")) {
                sb.append('V');
            }else if (morseCode[i].equals(".--")) {
                sb.append('W');
            }else if (morseCode[i].equals("-..-")) {
                sb.append('X');
            }else if (morseCode[i].equals("-.--")) {
                sb.append('Y');
            }else if (morseCode[i].equals("--..")) {
                sb.append('Z');
            }else if (morseCode[i].equals("|")) {
                sb.append(' ');
            }else {
                System.out.println("Error");
            }

        }

        System.out.println(sb);


    }
}
