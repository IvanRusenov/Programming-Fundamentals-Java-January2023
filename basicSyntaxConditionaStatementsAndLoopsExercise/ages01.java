package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class ages01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        String title = "";
        if (age>=0 && age <=2){
            title = "baby";
        } else if (age <=13) {
            title = "child";
        } else if (age <= 19) {
            title ="teenager";
        } else if (age <= 65) {
            title = "adult";
        } else if (age >= 66) {
            title = "elder";
        }
        System.out.println(title);
    }

}
