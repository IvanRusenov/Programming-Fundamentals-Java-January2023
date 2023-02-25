package TextProcessingMoreExercise;

import java.util.Scanner;

public class f05HTML {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String content = scan.nextLine();
        String comments = scan.nextLine();
        System.out.printf("<h1>\n     %s\n</h1>\n", title);
        System.out.printf("<article>\n     %s\n</article>\n", content);
        while (!comments.equals("end of comments")) {

            System.out.printf("<div>\n     %s\n</div>\n", comments);

            comments = scan.nextLine();

        }
    }
}
