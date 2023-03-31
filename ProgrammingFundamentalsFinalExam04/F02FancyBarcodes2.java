package F04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02FancyBarcodes2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {

            String input = scan.nextLine();

            Pattern pattern = Pattern.compile("@#+(?<barcode>[A-Z][A-Za-z\\d+]{4,}[A-Z])@#+");
            Matcher matcher = pattern.matcher(input);
            String group = "00";

            if (matcher.find()) {

                String barcode = matcher.group("barcode");
                pattern = Pattern.compile("[0-9]");
                matcher = pattern.matcher(barcode);
                StringBuilder sb = new StringBuilder();

                while (matcher.find()) {

                    sb.append(matcher.group());

                }

                if (!sb.toString().equals("")) {

                    group = sb.toString();
                }

                System.out.printf("Product group: %s\n", group);

            } else {

                System.out.println("Invalid barcode");

            }

        }

    }
}
