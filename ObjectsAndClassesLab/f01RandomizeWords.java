package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class f01RandomizeWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] input = scan.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {

            int index = rnd.nextInt(input.length);

            String element = input[i];


           input[i] = input[index];
           input[index] = element;
        }

        for (String item : input) {
            System.out.println(item);
        }

    }
}
