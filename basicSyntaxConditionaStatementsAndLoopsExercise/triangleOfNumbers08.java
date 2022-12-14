package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class triangleOfNumbers08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int rows = 1; rows <= num ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.printf("%d ",rows);
            }
            System.out.println();
        }
    }
}
