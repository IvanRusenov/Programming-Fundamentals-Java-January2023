package dataTypesandVariablesLab;

import java.util.Scanner;

public class lowerOrUppe08r {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char simbol = scan.nextLine().charAt(0);
        if (simbol>='a' && simbol<='z'){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
