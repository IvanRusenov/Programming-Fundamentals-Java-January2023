package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pokePowerOrigin = Integer.parseInt(scan.nextLine());//N
        int distance = Integer.parseInt(scan.nextLine());//M
        int exhaustionFactor = Integer.parseInt(scan.nextLine());//Y
        int poke = 0;
        int pokePower = pokePowerOrigin;

        while (pokePower >= distance){
            pokePower -= distance;
            poke++;
            if (pokePower == pokePowerOrigin * 0.50){
                if (exhaustionFactor!=0){
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.printf("%d\n",pokePower);
        System.out.println(poke);



    }
}
