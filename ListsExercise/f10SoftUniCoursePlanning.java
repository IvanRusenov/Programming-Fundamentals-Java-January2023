package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f10SoftUniCoursePlanning {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scan.nextLine()
                                .split(", "))
                                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("course start")) {

            String[] command = input.split(":");


            if (command[0].equals("Add")) {

                add(command[1], schedule);

            } else if (command[0].equals("Insert")) {

                insert(command[1], Integer.parseInt(command[2]), schedule);

            } else if (command[0].equals("Remove")) {

                remove(command[1], schedule);

            } else if (command[0].equals("Swap")) {

                swap(command[1], command[2], schedule);

            } else if (command[0].equals("Exercise")) {

                exercise(command[1], schedule);

            }

            input = scan.nextLine();

        }

        printSchedule(schedule);

    }
    public static boolean isExist(String lesson, List<String> schedule) {

        for (String item : schedule) {

            if (lesson.equals(item)) {
                return true;
            }
        }
        return false;
    }
    //Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
    public static void add(String lesson, List<String> schedule) {

        if (!isExist(lesson, schedule)) {

            schedule.add(lesson);

        }

    }

    //Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
    public static void insert(String title, int index, List<String> schedule) {


        if (!isExist(title, schedule)) {

            schedule.add(index, title);

        }

    }

    //Remove:{lessonTitle} - remove the lesson, if it exists
    public static void remove(String lesson, List<String> schedule) {

        if (isExist(lesson, schedule)) {

            String lessonExercise = lesson + "Exercise";
            schedule.remove(lesson);

            if (isExist(lessonExercise, schedule)) {

                schedule.remove(lessonExercise);
            }

        }

    }

    //Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
    public static void swap(String title1, String title2, List<String> schedule) {

        if (isExist(title1, schedule) && isExist(title2, schedule)) {

            int index1 = schedule.indexOf(title1);
            int index2 = schedule.indexOf(title2);

            schedule.set(index1, title2);
            schedule.set(index2, title1);

            String title1Exercise = title1 + "-Exercise";
            if (isExist(title1Exercise, schedule)) {

                int index = schedule.indexOf(title1);
                int indexTitle1Exercise = schedule.indexOf(title1Exercise);
                schedule.add(index + 1, title1Exercise);
                schedule.remove(indexTitle1Exercise + 1);
            }

            String title2Exercise = title2 + "-Exercise";
            if (isExist(title2Exercise, schedule)) {
                int index = schedule.indexOf(title2);
                int indexTitle2Exercise = schedule.indexOf(title2Exercise);
                schedule.add(index + 1, title2Exercise);
                schedule.remove(indexTitle2Exercise + 1);
            }
        }

    }

    //Exercise:{lessonTitle}
    public static void exercise(String title, List<String> schedule) {

        if (isExist(title, schedule)) {
            int index = schedule.indexOf(title);
            title += "-Exercise";
            if (!isExist(title, schedule)) {
                schedule.add(index + 1, title);
            }
        } else {
            add(title, schedule);
            title += "-Exercise";
            add(title, schedule);
        }

    }

    public static void printSchedule(List<String> schedule) {

        for (String item : schedule) {
            System.out.printf("%d.%s\n", schedule.indexOf(item) + 1, item);
        }

    }
}
