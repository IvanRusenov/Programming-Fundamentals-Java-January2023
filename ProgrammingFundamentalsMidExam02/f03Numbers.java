package ProgrammingFundamentalsMidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class f03Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> intList  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());


        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum += intList.get(i);
        }
        double avgNum = 1.0 * sum / intList.size();

        List<Integer> graterThanAvg = new ArrayList<>();
        int count = 0;
        for (int item:intList) {

            if (item > avgNum){
                graterThanAvg.add(item);
                count++;
            }
        }
        if (count == 0){
            System.out.printf("No");
            return;
        }
        Collections.sort(graterThanAvg);
        Collections.reverse(graterThanAvg);

        if (graterThanAvg.size() >= 5){
            List<Integer> top5 = graterThanAvg.subList(0,5);
            for (int item:top5) {

                System.out.printf("%d ",item);

            }

        }else {
            for (int item:graterThanAvg) {

                System.out.printf("%d ",item);

            }
        }




    }
}
