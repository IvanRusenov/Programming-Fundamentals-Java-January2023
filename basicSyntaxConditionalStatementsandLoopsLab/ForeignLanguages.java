package basicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String language = "";
        String country = scan.nextLine();
        if (country.equals("England")|| country.equals("USA")){
            language = "English ";
        } else if (country.equals("Spain")|| country.equals("Argentina")|| country.equals("Mexico")) {
            language = "Spanish";
        }else {
            language = "unknown";
        }
        System.out.println(language);
    }
}
