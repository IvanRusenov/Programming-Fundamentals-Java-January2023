package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f01SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Double> doubleList = Arrays
                .stream(scan.nextLine()
                .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < doubleList.size() - 1; i++) {
            double firsNum = doubleList.get(i);
            double secondNum = doubleList.get(i + 1);
            double result = 0;
            if (firsNum == secondNum){

                result = firsNum + secondNum;
                doubleList.remove(firsNum);
                doubleList.remove(secondNum);
                doubleList.add(i,result);

                i = -1;
            }

        }
        // !!! prints decimal part only if any
        String output = formattedOutput(doubleList, " ");
        System.out.println(output);

    }

    public static String formattedOutput(List<Double> doublesList, String delimiter){
        String output = "";
        for (double num: doublesList) {
            output += new DecimalFormat("0.#").format(num) + delimiter;
        }
        return output;
    }

}
