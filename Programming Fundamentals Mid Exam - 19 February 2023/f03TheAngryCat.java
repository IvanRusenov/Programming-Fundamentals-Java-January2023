package ProgrammingFundamentalsMidExam_19_02_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03TheAngryCat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] intArr = Arrays.stream(scan.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        int entryPoint = Integer.parseInt(scan.nextLine());

        String typeOfItems =scan.nextLine();

        if (typeOfItems.equals("cheap")){
            int leftSum = 0;
            int rightSum = 0;

            //< entriPoint
            for (int i = 0; i < entryPoint; i++) {

                if (intArr[i] < intArr[entryPoint]){
                    leftSum += intArr[i];
                }


            }

            for (int i = entryPoint + 1; i < intArr.length ; i++) {
                if (intArr[i] < intArr[entryPoint]){
                    rightSum += intArr[i];
                }
            }

            if (leftSum >= rightSum){
                System.out.printf("Left - %d",leftSum);
            }else {
                System.out.printf("Right - %d",rightSum);
            }
            



            
        } else if (typeOfItems.equals("expensive")) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < entryPoint; i++) {
                if (intArr[i] >= intArr[entryPoint]){
                   leftSum+=intArr[i];
                }
            }

            for (int i = entryPoint + 1; i < intArr.length; i++) {
                if (intArr[i] >= intArr[entryPoint]){
                    rightSum += intArr[i];
                }
            }

            if (leftSum >= rightSum){
                System.out.printf("Left - %d",leftSum);
            }else {
                System.out.printf("Right - %d",rightSum);
            }

        }
    }
}
