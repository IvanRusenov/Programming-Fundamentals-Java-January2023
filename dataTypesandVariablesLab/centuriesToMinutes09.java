package dataTypesandVariablesLab;

import java.util.Scanner;

public class centuriesToMinutes09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte centuryes = Byte.parseByte(scan.nextLine());
        int years = centuryes * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuryes, years, days, hours, minutes);

    }
}
