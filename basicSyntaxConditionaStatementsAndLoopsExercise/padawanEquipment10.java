package basicSyntaxConditionaStatementsAndLoopsExercise;

import java.util.Scanner;

public class padawanEquipment10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightsabersPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());
        int totalBeltsCount = studentsCount;
        if (studentsCount >5){
            totalBeltsCount -= studentsCount / 6;
        }
        double equipmentPrice = Math.ceil(studentsCount * 1.10) * lightsabersPrice +
                studentsCount * robesPrice + totalBeltsCount * beltPrice;
        double diff = Math.abs(budget - equipmentPrice);
        if (equipmentPrice <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.%n",equipmentPrice);
        }else {

            System.out.printf("George Lucas will need %.2flv more.",diff);
        }
    }
}
