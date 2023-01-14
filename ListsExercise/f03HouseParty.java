package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class f03HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] name = scan.nextLine().split("\\s+");


            if (name[2].contains("not")) {
                if (isInTheList(namesList, name[0])) {
                    namesList.remove(name[0]);

                } else {

                    System.out.printf("%s is not in the list!\n", name[0]);
                }

            } else {
                if (isInTheList(namesList, name[0])) {

                    System.out.printf("%s is already in the list!\n", name[0]);

                } else {
                    namesList.add(name[0]);

                }

            }


        }
        for (String name : namesList) {
            System.out.println(name);
        }
    }

    public static boolean isInTheList(List<String> namesList, String name) {

        return namesList.contains(name.split("\\s+")[0]);
    }
}
