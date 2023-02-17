package ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class f02TheLift {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int waitingPeoples = Integer.parseInt(scan.nextLine());


        int[] wagons = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int freeSpace = 0;

        for (int i = 0; i < wagons.length; i++) {       //обикалям кабинките

            freeSpace = 4 - wagons[i];                  //проверявам дали има свободно място

            //проверявам колко място има в кабинката и тъпча до 4, ако има достатъчно пътници

            if (freeSpace > 0) {                         //ако има свободно място в кабинката

                if (waitingPeoples >= freeSpace) {       //проверявам дали има останали хора за настаняване

                    wagons[i] += freeSpace;             //ако чакащите са повече от свободните места
                    waitingPeoples -= freeSpace;        //намалявам чакащите със свободните места
                    freeSpace = 0;
                } else {
                    wagons[i] += waitingPeoples;        //ако чакащите са по-малко от свободните места
                    freeSpace -= waitingPeoples;        //намалявам свободните места с колкото хора са останали да чакат
                    waitingPeoples -= waitingPeoples;   //намалявам чакащите с колкото са останали
                                                        //чакащите остават: 0
                    break;                              // няма смисъл да продължавам цикъла
                }


            } //какво правя, ако няма място - нищо за сега

        }
        // приключвам, когато чакащите свършат или няма място на лифта
        if (waitingPeoples == 0) {                       //ако няма чакащи за настаняване

            if (freeSpace == 0) {                        //ако всички са настанени и лифтът е пълен до горе

                printWagons(wagons);

            } else {                                    //ако всички са настанени и има останало място

                System.out.println("The lift has empty spots!");    //принтирам по условие
                printWagons(wagons);
            }


        } else if (waitingPeoples > 0) {                             //ако няма място на лифта

            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeoples);

            printWagons(wagons);                                    //принтирам по условие

        }
    }
    public static void printWagons (int[] wagons){              //метод за принтиране, който приема масив(лифт)
        for (int item : wagons) {                               //и го принтира
            System.out.printf("%d ", item);
        }
    }
}
