package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strArr = scan.nextLine().split(" ");

        for (int i = 0; i < strArr.length / 2; i++) {
           String oldItem = strArr[i];

           strArr[i] = strArr[strArr.length -1 - i];
            strArr[strArr.length -1 - i] = oldItem;
        }

        System.out.println(String.join(" ",strArr).toString());
    }
}
