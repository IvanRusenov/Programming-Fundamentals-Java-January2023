package ListsExercise;

import java.util.*;

public class f07AppendArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] arrays = input.trim().split("\\|");

        List<String> list = new ArrayList<>();

        for (int i = arrays.length-1; i >= 0 ; i--) {

            String[] element = arrays[i].trim().split("\\s+");

            list.addAll(Arrays.asList(element));

        }
        list.removeAll(Arrays.asList(""));
        System.out.println(list.toString().replaceAll("[\\[\\],]",""));
    }
}
