package MethodsMoreExercise;

import java.util.Scanner;

public class f05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //given three integers
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        printIsPositiveOrNegative(countNegativeNumbers(num1,num2,num3));


    }
    public static int countNegativeNumbers (int num1, int num2, int num3){
        int[] inputArr = {num1,num2,num3};
        int count = 0;
        for (int num:inputArr) {
            if (num == 0){
                return -1;
            } else if (num < 0){
                count++;
            }
        }
       return count;
    }
    public static void printIsPositiveOrNegative(int count){
        if(count < 0){
            System.out.println("zero");
        } else if (count % 2 == 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }


}
