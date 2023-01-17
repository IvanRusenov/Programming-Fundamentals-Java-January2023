package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f01Messaging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<Integer> intList  = Arrays.stream(scan.nextLine()
                               .split("\\s+"))
                               .map(Integer::parseInt)
                               .collect(Collectors.toList());
        String text = scan.nextLine();
        String finalString = "";

        for (int i = 0; i < intList.size(); i++) {

            int element = intList.get(i);
            int result = 0;

            while (element > 0){

                int num = element % 10;

                result += num;

                element /= 10;

            }

            
          int index = result % text.length();
            finalString += text.charAt(index);
            String str ="";
           str += text.charAt(index);

            text = text.replaceFirst(str,"");

        }
        System.out.println(finalString);
    }
}
