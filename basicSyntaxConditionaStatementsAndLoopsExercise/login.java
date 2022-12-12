package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        char ch ;
        String password = "";
        int count = 0;
        String input ="";

        for (int i = username.length()-1; i >= 0; i--) {
            ch = username.charAt(i);
            password = "" +  password + ch;
        }
        input = scan.nextLine();
        while (!input.equals(password)){
            count++;
            if (count==4){
                System.out.printf("User %s blocked!%n",username);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            input = scan.nextLine();
        }
        if (input.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
