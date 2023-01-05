package MethodsLab;

import java.util.Scanner;

public class f09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        if (type.equals("int")){
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            System.out.println(getMax(num1,num2));

        } else if (type.equals("char")) {
            char firstChar = scan.nextLine().charAt(0);
            char secondChar = scan.nextLine().charAt(0);
            System.out.println(getMax(firstChar,secondChar));

        } else if (type.equals("string")) {
            String firstString = scan.nextLine();
            String secondString = scan.nextLine();
            System.out.println( getMax(firstString,secondString));
        }

    }

    public static int getMax (int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static char getMax(char a, char b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public static String getMax (String a, String b){
        if (a.compareTo(b) >= 0){
            return a;
        } else {
            return  b;
        }
    }

}
