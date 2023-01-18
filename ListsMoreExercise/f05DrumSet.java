package ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f05DrumSet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double savings = Double.parseDouble(scan.nextLine());



        List<Integer> drumSetInitial  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> drumSet = new ArrayList<>(drumSetInitial);

        String command = scan.nextLine();

        while(!command.equals("Hit it again, Gabsy!") && drumSet.size() > 0){

            int powerApplied = Integer.parseInt(command);

            for (int i = 0; i < drumSetInitial.size(); i++) {

                int drum = drumSet.get(i);

                drum -= powerApplied;

                if (drum <= 0){

                    drumSet.set(i,drumSetInitial.get(i));
                    int drumPrice = drumSetInitial.get(i) * 3;

                    if (drumPrice > savings){

                        drumSet.remove(i);
                        drumSetInitial.remove(i);
                        i--;

                    }else{

                        savings -= drumPrice;

                    }



                }else {
                    drumSet.set(i,drum);
                }

            }


            command = scan.nextLine();


        }
        if (drumSet.size() <= 0){
            System.out.println("No more drums");
        } else {

            for (int item : drumSet) {
                System.out.printf("%d ",item);
            }
            System.out.println();
            System.out.printf("Gabsy has %.2flv.",savings);
        }
    }

}
