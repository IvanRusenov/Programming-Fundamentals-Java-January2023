package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class f07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <Integer> intList = Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < intList.size(); i++) {

            if (intList.get(i) < 0){
                intList.remove(i);
                i = -1;
            }

        }
        if (intList.size()>0){
            Collections.reverse(intList);

            for (int item : intList) {
                System.out.printf("%d ",item);
            }
        }else {
            System.out.println("empty");
        }

    }
}
