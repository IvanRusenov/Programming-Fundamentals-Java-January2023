package ProgrammingFundamentalsMidExam02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> intList  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String input = scan.nextLine();


        while(!input.equals("end")){


            String[] command = input.split(" ");

            if (command[0].startsWith("swap")){

                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                int el1 = intList.get(index1);
                int el2 = intList.get(index2);

                intList.set(index1,el2);
                intList.set(index2,el1);

            }else if (command[0].startsWith("multiply")){

                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);

                intList.set(index1,intList.get(index1) * intList.get(index2));


            }else if (command[0].equals("decrease")){

                for (int i = 0; i < intList.size(); i++) {
                    intList.set(i,intList.get(i) -1);
                }

            }
            input = scan.nextLine();
        }
        for (int i = 0; i < intList.size(); i++) {

            if (i == intList.size()-1){
                System.out.printf("%d",intList.get(i));

            }else {
                System.out.printf("%d, ",intList.get(i));
            }

        }
    }
}
