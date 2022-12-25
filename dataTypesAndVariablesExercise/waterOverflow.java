package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int litersWater = Integer.parseInt(scan.nextLine());

            if (sum + litersWater > 255){
                System.out.printf("Insufficient capacity!\n");
                continue;
            }else{
                sum +=litersWater;
            }

        }
        System.out.println(sum);

    }
}
