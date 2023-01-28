package MapsLambdaAndStreamAPLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class f01CountRealNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        TreeMap<Double,Integer> numbersHashMap = new TreeMap<>();

        List<Double> doublesList = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (Double el:doublesList) {

            if (!numbersHashMap.containsKey(el)){

                numbersHashMap.put(el,1);

            }else{
                numbersHashMap.put(el, numbersHashMap.get(el) +1);
            }
        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : numbersHashMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#####");
            System.out.printf("%s -> %d\n",df.format(doubleIntegerEntry.getKey()),doubleIntegerEntry.getValue());
        }


    }
}
