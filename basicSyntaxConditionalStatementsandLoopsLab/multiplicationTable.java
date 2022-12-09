package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte num = Byte.parseByte(scan.nextLine());
        for (byte i = 1; i <=10 ; i++) {
            int product = num * i;
            System.out.printf("%d X %d = %d%n",num,i,product);
        }

    }
}
