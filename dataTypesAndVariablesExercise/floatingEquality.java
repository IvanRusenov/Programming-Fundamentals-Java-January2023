package dataTypesAndVariablesExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class floatingEquality {
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            BigDecimal num1 = new BigDecimal(scan.next());
            BigDecimal num2 = new BigDecimal(scan.next());
            BigDecimal eps = new BigDecimal(0.000001);
            BigDecimal result = new BigDecimal(0);
            result =  num1.subtract(num2).abs();
            if (result.compareTo(eps) <= 0){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
