package RegularExpressionsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class f02Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> participants = Arrays.stream(input.split(", ")).toList();

        input = scan.nextLine();
        while (!input.equals("end of race")) {

            


            input = scan.nextLine();

        }
    }

}
