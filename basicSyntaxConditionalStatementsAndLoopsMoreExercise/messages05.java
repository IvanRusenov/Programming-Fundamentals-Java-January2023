package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class messages05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCount = Integer.parseInt(scan.nextLine());
        String message = "";
        for (int i = 0; i < numCount; i++) {
            String digit = scan.nextLine();
            if (digit.length() == 1) {
                if (digit.equals("2")) {
                    message += "a";
                } else if (digit.equals("3")) {
                    message += "d";
                } else if (digit.equals("4")) {
                    message += "g";
                } else if (digit.equals("5")) {
                    message += "j";
                } else if (digit.equals("6")) {
                    message += "m";
                } else if (digit.equals("7")) {
                    message += "p";
                } else if (digit.equals("8")) {
                    message += "t";
                } else if (digit.equals("9")) {
                    message += "w";
                } else if (digit.equals("0")) {
                    message += " ";
                } else if (digit.equals("1")) {
                    message += "";
                }
            } else if (digit.length() == 2) {
                if (digit.equals("22")) {
                    message += "b";
                } else if (digit.equals("33")) {
                    message += "e";
                } else if (digit.equals("44")) {
                    message += "h";
                } else if (digit.equals("55")) {
                    message += "k";
                } else if (digit.equals("66")) {
                    message += "n";
                } else if (digit.equals("77")) {
                    message += "q";
                } else if (digit.equals("88")) {
                    message += "u";
                } else if (digit.equals("99")) {
                    message += "x";
                }
            } else if (digit.length() == 3) {
                if (digit.equals("222")) {
                    message += "c";
                } else if (digit.equals("333")) {
                    message += "f";
                } else if (digit.equals("444")) {
                    message += "i";
                } else if (digit.equals("555")) {
                    message += "l";
                } else if (digit.equals("666")) {
                    message += "o";
                } else if (digit.equals("777")) {
                    message += "r";
                } else if (digit.equals("888")) {
                    message += "v";
                } else if (digit.equals("999")) {
                    message += "y";
                }
            } else if (digit.length() == 4) {
                if (digit.equals("7777")) {
                    message += "s";
                } else if (digit.equals("9999")) {
                    message += "z";
                }
            }
        }
        System.out.println(message);
    }
}