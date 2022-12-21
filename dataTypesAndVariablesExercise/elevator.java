package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());//number of peoples
        int p = Integer.parseInt(scan.nextLine());//capacity

        int fullCourses = n/p;
        int aditionalCours = n%p;
        if (aditionalCours != 0){
            fullCourses++;
        }
        System.out.println(fullCourses);
    }
}
