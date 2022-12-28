package arraysExercise;

import java.util.Scanner;

public class arrayRotation04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String[] input = scan.nextLine().split(" ");
       int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String element = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j]=input[j+1];
            }
            input[input.length-1] = element;
        }
        for (String items:input) {
            System.out.printf("%s ",items);
        }
    }
}
