package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class f04MixedUpLists {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> intList1  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> intList2  = Arrays.stream(scan.nextLine()
                                .split("\\s+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int shortSize = 0;
        int limit1 = 0;
        int limit2 = 0;


        if (intList1.size()>intList2.size()){
            shortSize = intList2.size();

            limit1 = intList1.get(intList1.size()-1);
            limit2 = intList1.get(intList1.size()-2);
        }else {
            shortSize = intList1.size();
            limit1 = intList2.get(0);
            limit2 = intList2.get(1);
        }

        for (int i = 0; i < shortSize; i++) {

            resultList.add(intList1.get(i));
            resultList.add(intList2.get(intList2.size()-1-i));

        }

        int smallNum = 0;
        int bigNum =0;

        if (limit1 <= limit2){

            smallNum = limit1;
            bigNum = limit2;

        }else {

            smallNum = limit2;
            bigNum = limit1;

        }

        List<Integer> finalList = new ArrayList<>();

        for (int num:resultList) {

            if (num > smallNum && num < bigNum){
                finalList.add(num);
            }
        }

        Collections.sort(finalList);

        for (int num:finalList) {
            System.out.printf("%d ",num);
        }
    }
}
