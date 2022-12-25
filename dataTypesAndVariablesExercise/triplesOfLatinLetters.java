package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (char i = 'a'; i < 'a'+n ; i++) {
            for (char j = 'a'; j < 'a'+ n ; j++) {
                for (int k = 'a'; k < 'a' + n ; k++) {
                    System.out.printf("%c%c%c\n",i,j,k);
                }
            }
        }
    }
}
