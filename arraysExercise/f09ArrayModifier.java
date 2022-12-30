package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f09ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int firstNum = numArr[index1];
                numArr[index1] = numArr[index2];
                numArr[index2] = firstNum;
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                numArr[index1] = numArr[index1] * numArr[index2];
            } else if (command.equals("decrease")) {
                for (int i = 0; i < numArr.length; i++) {
                    numArr[i] -= 1;
                }
            }
            command = scan.nextLine();
        }
        for (int i = 0; i < numArr.length; i++) {
           if ( i != numArr.length - 1){
               System.out.printf("%d, ",numArr[i]);
           }else {
               System.out.printf("%d",numArr[i]);
           }
        }
    }
}

