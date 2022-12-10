package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class studentInformation01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double grade =  Double.parseDouble(scan.nextLine());


        String personInfo = String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
        System.out.println(personInfo);

//        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}
