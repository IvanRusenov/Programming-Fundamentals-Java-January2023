import java.util.Scanner;

public class f06BalancedBrackets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int openingBracket = 0;
        int closingBracket = 0;
        boolean isBalabced = true;

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();
            if (input.contains("(")){

                openingBracket++;

            }
            if (input.contains(")")) {

                closingBracket++;

            }
            if (openingBracket > closingBracket+1){

                isBalabced = false;
                break;

            }
            if (closingBracket > openingBracket) {

                isBalabced = false;
                break;
            }

        }

        if (openingBracket==closingBracket){

            isBalabced = true;

        } else if (openingBracket>closingBracket) {

            isBalabced = false;
        }

        if (isBalabced){

            System.out.println("BALANCED");

        }else {

            System.out.println("UNBALANCED");

        }
    }
}
