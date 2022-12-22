package dataTypesAndVariablesExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class fromLefTtoTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            BigInteger leftNum = new BigInteger(String.valueOf(scan.nextBigInteger()));
            BigInteger rightNum = new BigInteger(String.valueOf(scan.nextBigInteger()));
            if (leftNum.compareTo(rightNum) > 0){
                BigInteger sum = new BigInteger(String.valueOf(0));
                while (!(leftNum.compareTo(BigInteger.ZERO) == 0)){
                    sum = sum.add(leftNum.remainder(BigInteger.TEN));
                    leftNum = leftNum.divide(BigInteger.TEN) ;
                }
                System.out.printf("%d\n",sum.abs());
            }else {
                BigInteger sum = new BigInteger(String.valueOf(0));
                while (!(rightNum.compareTo(BigInteger.ZERO) == 0)){
                    sum = sum.add(rightNum.remainder(BigInteger.TEN)) ;
                    rightNum = rightNum.divide(BigInteger.TEN) ;
                }
                System.out.printf("%d\n",sum.abs());
            }

        }

    }
}
