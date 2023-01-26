package f03CarSalesman;

import java.util.Scanner;

public class f05DecryptingMessage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        int result = 0;
        String message = "";

        for (int i = 0; i < n; i++) {


            char ch = scan.nextLine().charAt(0);

            result = key + ch;
            message += "" +(char)result;

        }
        System.out.println(message);

    }
}
