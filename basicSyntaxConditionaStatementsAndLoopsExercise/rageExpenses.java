package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int breakKeyboard =0;
        int breakDisplay = 0;
        int breakHeadset = lostGameCount / 2;
        int breakMouse = lostGameCount/3;
        if ( lostGameCount >= 6){
            breakKeyboard = lostGameCount / 6;
        }
        if (lostGameCount >= 12){
            breakDisplay = lostGameCount / 12;
        }
        double expenses = breakHeadset * headSetPrice + breakMouse * mousePrice + breakKeyboard * keyboardPrice + breakDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }
}
