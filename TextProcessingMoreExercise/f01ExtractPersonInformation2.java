package TextProcessingMoreExercise;

import java.util.Scanner;

public class f01ExtractPersonInformation2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();
            int nameStartIndex = -1;
            int nameEndIndex = -1;
            int ageStartIndex = -1;
            int ageEndIndex = -1;

            for (int j = 0; j < input.length(); j++) {

                char currentChar = input.charAt(j);

               if (currentChar == '@'){
                  nameStartIndex = j+1;
               } else if (currentChar == '|') {
                   nameEndIndex = j;
               } else if (currentChar == '#') {
                   ageStartIndex = j+1;
               }else if (currentChar == '*') {
                   ageEndIndex = j;
               }
            }

            String name = input.substring(nameStartIndex,nameEndIndex);
            String age = input.substring(ageStartIndex,ageEndIndex);

            System.out.printf("%s is %s years old.\n",name,age);

        }
    }
}
