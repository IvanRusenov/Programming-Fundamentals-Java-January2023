package MethodsLab;

import java.util.Scanner;

public class f07RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringToRepeat = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        String resultString = resultString(stringToRepeat,count);
        System.out.printf("%s",resultString);
        
    }
    public static String resultString (String str, int count){
        String newString= "";
        for (int i = 0; i < count ; i++) {
            newString += str;
        }
        return newString;
    }

}
