package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class f03BigFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));

        }

        System.out.println(factorial);
    }
}
