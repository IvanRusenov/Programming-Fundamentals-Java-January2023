package ProgrammingFundamentalsMidExam_19_02_2023;

import java.util.Scanner;

public class f01ExperienceGaining {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scan.nextLine());
        int countOfBattles = Integer.parseInt(scan.nextLine());
        boolean isEnough = false;
        int battleCount = 0;
        double experience = 0.0;
        for (int i = 1; i <= countOfBattles; i++) {

            double experienceNeededForBattle = Double.parseDouble(scan.nextLine());
           battleCount++;

            experience += experienceNeededForBattle;

            if (i % 3 == 0){
            experience += experienceNeededForBattle * 0.15;
            }

            if (i % 5 == 0){
                experience -= experienceNeededForBattle * 0.10;
            }

            if (i % 15 == 0){
                experience += experienceNeededForBattle * 0.05;
            }

            if (experience >= neededExperience){
                isEnough = true;
                break;
            }


        }


        if (isEnough){
            System.out.printf("Player successfully collected his needed experience for %d battles.",battleCount);
        }else {
            System.out.printf("Player was not able to collect the needed experience," +
                    " %.2f more needed.",neededExperience-experience);
        }





    }
}
