package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class strongNumber06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int originalNum = Integer.parseInt(scan.nextLine());
        int digit =0;
        int factorial = 1;
        int sum = 0;
        int num = originalNum;

  while(num>=1){
      digit = num%10;
      factorial = 1;
      for (int i = digit; i >0 ; i--) {
          factorial *= i;
      }
      sum +=factorial;
      num = num /10;
  }
        if (sum == originalNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
