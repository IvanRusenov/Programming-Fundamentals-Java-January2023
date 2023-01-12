package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f04ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // get list integers from console
        List <String> strList = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        // get command
        String command = scan.nextLine();

        // while
        while (!command.equals("end")){
            String[] commandArr =getCommand(command);
            // command invoke right method
            if (commandArr[0].equals("Add")){

                add(strList,getCommand(command));

            } else if (commandArr[0].equals("Remove")) {

               remove(strList,getCommand(command));

            } else if (commandArr[0].equals("RemoveAt")) {

                removeAt(strList,getCommand(command));

            } else if (commandArr[0].equals("Insert")) {

                 insert(strList,getCommand(command));

            }

            command = scan.nextLine();
        }

        for (String element:strList) {
            System.out.printf("%s ",element);
        }

    }
    // method getCommand
    public static String[] getCommand (String command){

        return command.split(" ");
    }

    //Add {number}: add a number to the end of the list

    public static List<String> add (List<String> strList, String[] command){

        String  element = command[1];

        strList.add(element);

        return strList;
    }
    //Remove {number}: remove a number from the list

    public static List<String> remove (List<String> strList, String[] command){

        String element = command[1];
        //remove object
        strList.remove(element);

        return strList;
    }
    //RemoveAt {index}: remove a number at a given index

    public static List<String> removeAt (List<String> strList, String[] command){

        int index = Integer.parseInt(command[1]);

       //remove index
        strList.remove(index);

        return strList;
    }

    //Insert {number} {index}: insert a number at a given index

    public static List<String> insert (List<String> strList, String [] command){

        String element = command[1];
        int index = Integer.parseInt(command[2]);

        strList.add(index,element);

        return strList;
    }
}
