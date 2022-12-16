package basicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class sortNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int maxNum = num1;
        if (num2>maxNum || num3>maxNum){
            if (num2 > num3){
                maxNum= num2;
            }else {
                maxNum = num3;
            }
        }
        int minNum = num1;
        if (num2<num1 || num3 < num1){
            if (num2<num3){
                minNum = num2;
            }else{
                minNum = num3;
            }
        }
        int middleNum = num1 + num2 + num3 - maxNum - minNum;
        System.out.printf("%d%n%d%n%d%n",maxNum,middleNum,minNum);


    }
}
