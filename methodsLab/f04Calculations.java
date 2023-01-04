package MethodsLab;

import java.util.Scanner;

public class f04Calculations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (command.equals("add")){
            printResult(add(num1,num2));
        } else if (command.equals("multiply")) {
            printResult(multiply(num1,num2));
        } else if (command.equals("subtract")) {
          printResult(subtract(num1, num2));
        } else if (command.equals("divide")) {
            printResult(divide(num1, num2));
        }

    }
    public static void printResult(int result){
        System.out.printf("%d ",result);
    }
    public static int add (int a, int b){
        int result = a + b;
        return result;

    }
    public static int multiply (int a , int b){
        int result = a * b;
        return result;
    }
    public static int subtract (int a, int b){
        int result = a - b;
      return result ;
    }
    public static int divide (int a, int b){
        int result = a / b;
        return result;
    }

}
