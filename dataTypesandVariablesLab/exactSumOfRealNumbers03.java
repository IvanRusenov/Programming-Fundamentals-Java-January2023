package dataTypesandVariablesLab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class exactSumOfRealNumbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal num = new BigDecimal(scan.nextLine());
            result = result.add(num);
        }
        System.out.println(result);

    }
}
