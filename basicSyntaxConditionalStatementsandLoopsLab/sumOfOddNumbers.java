package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte n = Byte.parseByte(scan.nextLine());
        int count = 0;
        int num = 0;
        int sum = 0;
        while (count != n){
            num++;
            if (num%2!=0){
                count++;
                System.out.println(num);
                sum +=num;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
