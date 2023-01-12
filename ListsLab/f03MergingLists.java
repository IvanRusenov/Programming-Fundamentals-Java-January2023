package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class f03MergingLists {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = getInputToIntList(scan);
        List<Integer> secondList = getInputToIntList(scan);

        List<Integer> mergedList = mergeTwoLists(firstList,secondList);

        printMergedList(mergedList);

    }
    public static List<Integer> getInputToIntList(Scanner scan){

        List<Integer> intList = Arrays
                .stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return intList;
    }


    public static List<Integer> mergeTwoLists(List<Integer> firstList, List<Integer> secondList){
        List<Integer> mergedList = new ArrayList<>();

        if (firstList.size() == secondList.size()){
            for (int i = 0; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
                mergedList.add(secondList.get(i));
            }
        }else{
            int shortestSize = 0;
            if (firstList.size() < secondList.size()){
                shortestSize = firstList.size();
                for (int i = 0; i < shortestSize; i++) {
                    mergedList.add(firstList.get(i));
                    mergedList.add(secondList.get(i));
                }
                for (int i = firstList.size(); i < secondList.size() ; i++) {
                    mergedList.add(secondList.get(i));
                }
            }else {
                shortestSize = secondList.size();
                for (int i = 0; i < shortestSize; i++) {
                    mergedList.add(firstList.get(i));
                    mergedList.add(secondList.get(i));
                }
                for (int i = secondList.size(); i < firstList.size() ; i++) {
                    mergedList.add(firstList.get(i));
                }
            }
        }
        return mergedList;
    }

    public static void printMergedList(List<Integer> intList){
        for (int num:intList ) {
            System.out.printf("%d ",num);
        }
    }

}
