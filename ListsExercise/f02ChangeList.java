package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02ChangeList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> intList  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scan.nextLine();
        while(!command.equals("end")){

            if (command.contains("Delete")){

                delete(intList,command);

            } else if (command.contains("Insert")) {

                insert(intList,command);
            }


            command = scan.nextLine();
        }
        //print
        System.out.println(intList.toString().replaceAll("[\\[\\],]",""));

    }
    //•	Delete {element} - delete all elements in the array which are equal to the given element

    public static void delete (List <Integer> intList,String command){
        int element = Integer.parseInt(command.split("\\s+")[1]);

        intList.removeAll(Arrays.asList(element));

    }
    //•	Insert {element} {position} - insert element at the given position

    public static void insert (List <Integer> intList, String command){
        int element = Integer.parseInt(command.split("\\s+")[1]);
        int index = Integer.parseInt(command.split("\\s+")[2]);

        intList.add(index,element);

    }


}
