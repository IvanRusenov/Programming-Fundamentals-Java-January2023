package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        int num = Integer.parseInt(scan.nextLine());
//        int multiplayer = Integer.parseInt(scan.nextLine());
//
//        if (multiplayer>10){
//            System.out.printf("%d X %d = %d",num,multiplayer,num * multiplayer);
//        }else {
//            for (int i = multiplayer; i <=10 ; i++) {
//                int result = num * i;
//                System.out.printf("%d X %d = %d%n",num,i,result);
//            }
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.println(2 * i + 1);
//            sum += 2 * i +1;
//        }
//        System.out.printf("Sum: %d%n", sum);

        int n = Integer.parseInt(scan.nextLine());
        while(n%2!=0){
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(n));

    }
    }

