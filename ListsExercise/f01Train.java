package ListsExercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //list of wagons
        List<Integer> wagons = Arrays
                                .stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        //capacity of wagons
        int wagonCapacity = Integer.parseInt(scan.nextLine());
        //commands
        String command = scan.nextLine();
        while (!command.equals("end")){
            //•	Add {passengers} - add a wagon to the end with the given number of passengers
            //•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
            if (command.contains("Add")){
                int passengers = Integer.parseInt(command.split("\\s+")[1]);
                wagons.add(passengers);
            } else  {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    if(wagons.get(i)+passengers <= wagonCapacity){
                        wagons.set(i,wagons.get(i)+passengers);
                        break;
                    }
                }
            }
            command = scan.nextLine();
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));
        // print
    }
}
