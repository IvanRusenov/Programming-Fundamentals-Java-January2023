package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            boolean isInteger = false;
            boolean isDouble = false;
            boolean isString = false;
            boolean isChar = false;
            boolean isBoolean = false;
            if (input.length() == 1){
                if (input.charAt(0) < '0' || input.charAt(0) > '9'){
                    isChar = true;
                }else {
                    isInteger = true;
                }
            }else if (input.length() > 1) {
                int dotCount = 0;
                int diffCount = 0;
                int minusCount = 0;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '.') {
                        dotCount++;
                    } else if (input.charAt(i) == '-') {
                        minusCount++;
                    } else if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
                        diffCount++;
                    }
                }
                if (diffCount != 0 ) {
                    if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")){
                        isBoolean = true;
                    }else{
                        isString = true;
                    }
                } else if (dotCount == 1 ) {
                    isDouble=true;
                } else {
                    isInteger=true;
                }
            }
            if (isChar){
                System.out.printf("%s is character type\n", input);
            }else if (isDouble) {
                System.out.printf("%s is floating point type\n", input);
            } else if (isBoolean) {
                System.out.printf("%s is boolean type\n", input);
            } else if (isInteger) {
                System.out.printf("%s is integer type\n", input);
            } else if (isString) {
                System.out.printf("%s is string type\n", input);
            }
            input = scan.nextLine();
        }
    }
}
