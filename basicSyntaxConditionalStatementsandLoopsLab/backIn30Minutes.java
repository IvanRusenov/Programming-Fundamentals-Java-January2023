package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int timeInMinutes = hours * 60 + minutes + 30;
        int newHour = timeInMinutes / 60;
        int newMinutes = timeInMinutes % 60;
        if (newHour>23){
            newHour = 0;
        }
        System.out.printf("%d:%02d",newHour,newMinutes);
    }
}
