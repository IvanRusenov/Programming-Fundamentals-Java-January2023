package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class printAndSum04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNum = Integer.parseInt(scan.nextLine());
        int endnum = Integer.parseInt(scan.nextLine());
        int sum =0;

        for (int i = startNum; i <= endnum ; i++) {
            sum+= i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
