package ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f03Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());


       String input  = scan.nextLine();

       while (!input.equals("Craft!")){

           String[] command = input.split(" - ");

           if (command[0].startsWith("Collect")){
               String item = command[1];
               if (!items.contains(item)){
                   items.add(item);
               }

           } else if (command[0].startsWith("Drop")) {

               String item = command[1];
               items.remove(item);

           }else if (command[0].startsWith("Combine")) {

               String oldItem = command[1].split(":")[0];
               String newItem = command[1].split(":")[1];

               if (items.contains(oldItem)){

                   int index = items.indexOf(oldItem);
                   items.add(index +1,newItem);
               }

           }else if (command[0].startsWith("Renew")) {
               String item = command[1];
               if (items.contains(item)){
                   items.remove(item);
                   items.add(item);
               }

           }


           input = scan.nextLine();
       }

        System.out.println(String.join(", ",items));
    }
}
