package MethodsMoreExercise;

import java.util.Scanner;

public class f01DataTypes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        dataValidator(type, scan);

    }

   public static void dataValidator (String input, Scanner scan){
        if (input.equals("string")){

            String text = scan.nextLine();
            System.out.println(inputDifferentTypeOfData(text));

        } else if (input.equals("int")) {

            int num = Integer.parseInt(scan.nextLine());
            System.out.println(inputDifferentTypeOfData(num));

        } else if (input.equals("real")) {

            double num = Double.parseDouble(scan.nextLine());
            System.out.printf("%.2f", inputDifferentTypeOfData(num));

        }
   }

    //create method that takes int sa input
    public static int inputDifferentTypeOfData(int num) {
        return num * 2;
    }

    //create method that takes double as input
    public static double inputDifferentTypeOfData(double num) {
        return num * 1.5;
    }

    //create method that takes string as input
    public static String inputDifferentTypeOfData(String text) {
        return "$" + text + "$";
    }

}
