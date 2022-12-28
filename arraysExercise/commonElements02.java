package arraysExercise;

import java.util.Scanner;

public class commonElements02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstInput = scan.nextLine().split(" ");
        String[] secondInput = scan.nextLine().split(" ");
        for (int i = 0; i < secondInput.length; i++) {
            for (int j = 0; j < firstInput.length; j++) {
                if (secondInput[i].equals(firstInput[j])){
                    System.out.printf("%s ",secondInput[i]);
                }
            }
        }
    }
}
