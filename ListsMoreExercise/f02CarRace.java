package ListsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class f02CarRace {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] raceTrack = Arrays.stream(scan.nextLine()
                            .split(" "))
                            .mapToDouble(Double::parseDouble)
                            .toArray();


        System.out.println(winner(leftCarTime(raceTrack),rightCarTime(raceTrack)));

    }

    public static String winner (double leftCartTime, double rightCarTime){

        String name = "";
        double time = 0.0;

        if (leftCartTime < rightCarTime){

            name = "left";
            time = leftCartTime;

        }else {

            name = "right";
            time = rightCarTime;
        }

        return  String.format("The winner is %s with total time: %.1f",name,time);

    }

    public static double leftCarTime (double[] raceTrack){

        double leftCarTime = 0;

        for (int i = 0; i < raceTrack.length/2; i++) {

            leftCarTime += raceTrack[i];

            if (raceTrack[i] == 0){

                leftCarTime *= 0.80;

            }

        }
        return leftCarTime;
    }

    public static double rightCarTime (double[] raceTrack){

        double rightCarTime = 0;

        for (int i = raceTrack.length-1; i > raceTrack.length/2 ; i--) {

            rightCarTime += raceTrack[i];

            if (raceTrack[i] == 0){

                rightCarTime *= 0.80;
            }

        }
        return rightCarTime;
    }

}
