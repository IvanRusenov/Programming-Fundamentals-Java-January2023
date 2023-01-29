package MapsLambdaAndStreamAPLab;

import java.util.Arrays;
import java.util.Scanner;

public class f04WordFilter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String [] words = Arrays.stream(scan.nextLine().split(" "))
               .filter(e-> (e.length() % 2) == 0).toArray(String[] :: new);

        System.out.println(String.join(System.lineSeparator(),words));


    }
}
