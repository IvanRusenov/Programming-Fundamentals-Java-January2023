package ArraysMoreExercise;

import java.util.Scanner;

public class f03RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(fibonacci(n));


    }

    public static int fibonacci (int n){

        if (n<3){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

}
