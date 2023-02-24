package TextProcessingMoreExercise;

import java.util.Scanner;

public class f02AsciiSumator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char ch1 = scan.nextLine().charAt(0);
        char ch2 = scan.nextLine().charAt(0);
        String text = scan.nextLine();
        int sum = 0;

        for (char item:text.toCharArray()) {

            if (item > ch1 && item < ch2){
                sum += item;
            }

        }

        System.out.printf("%d",sum);

    }
}
