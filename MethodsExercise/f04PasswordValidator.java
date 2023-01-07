package MethodsExercise;

import java.util.Scanner;

public class f04PasswordValidator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        boolean isValid = false;

        printCheckPasswordResult(password,isValid);

    }

    public static void printCheckPasswordResult(String password, boolean isValid) {


        boolean isValidLength = checkPasswordLength(password,isValid);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidSymbol = checkPasswordForValidSymbols(password,isValid);
        if (!isValidSymbol) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isContainTwoDigits = checkPasswordFor2Digits(password,isValid);
        if (!isContainTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidSymbol && isContainTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkPasswordLength(String pass, boolean isValid) {

        if (pass.length() >= 6 && pass.length() <= 10) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean checkPasswordFor2Digits(String pass, boolean isValid) {

        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                count++;
            }
        }
        if (count >= 2) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean checkPasswordForValidSymbols(String pass, boolean isValid) {

        pass = pass.toLowerCase();
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if ((symbol >= 'a' && symbol <= 'z') || (symbol >= '0' && symbol <= '9')) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;

    }
}



