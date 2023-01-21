package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class f05Students {

    public static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public String getFirstName() {
            return this.firstName;
        }


        public String getLastName() {
            return this.lastName;
        }


        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {

            String[] data = input.split("\\s+");

            Student newStudent = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
            boolean isFound = false;
            if (students.size() == 0) {

                students.add(newStudent);

            } else {

                for (Student item : students) {

                    if (newStudent.getFirstName().equals(item.getFirstName())
                            && newStudent.getLastName().equals(item.getLastName())) {

                        item.setTown(newStudent.getTown());
                        item.setAge(newStudent.getAge());
                        isFound = true;
                        break;

                    }

                }
                if (!isFound){

                    students.add(newStudent);

                }
            }

            input = scan.nextLine();

        }

        String town = scan.nextLine();

        for (Student student : students) {
            if (town.equals(student.getTown())) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
