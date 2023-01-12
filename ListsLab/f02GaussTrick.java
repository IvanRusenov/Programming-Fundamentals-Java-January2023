package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f02GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        if (intList.size()%2 ==0){
            for (int i = 0; i < intList.size()/2; i++) {
                if (i == (intList.size()-i-1)){
                    System.out.printf("%d ",intList.get(i));
                } else {
                    int result = intList.get(i) + intList.get(intList.size()-i-1);
                    System.out.printf("%d ",result);
                }

            }
        }else {
            for (int i = 0; i < intList.size()/2+1; i++) {
                if (i == (intList.size()-i-1)){
                    System.out.printf("%d ",intList.get(i));
                } else {
                    int result = intList.get(i) + intList.get(intList.size()-i-1);
                    System.out.printf("%d ",result);
                }
            }
        }



    }

}
