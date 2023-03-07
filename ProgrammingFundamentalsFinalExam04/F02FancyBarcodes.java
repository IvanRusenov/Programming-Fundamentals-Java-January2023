package ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F02FancyBarcodes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();

            Pattern pattern = Pattern.compile("([@][#]+)([A-Z][A-Za-z0-9]{5,})((?<=[A-Z]))([@][#]+)");
            Matcher matcher = pattern.matcher(input);
            String productGroup = "00";
            boolean isValidBarCode = false;

            while (matcher.find()) {

                isValidBarCode = true;

                StringBuilder sb = new StringBuilder();

                for (char item : matcher.group().toCharArray()) {

                    if (item >= '0' && item <= '9') {

                        sb.append(item);

                    }
                }

                if (sb.length() != 0) {

                    productGroup = sb.toString();

                }

            }

            if (isValidBarCode){

                System.out.printf("Product group: %s\n",productGroup);

            }else {

                System.out.println("Invalid barcode");

            }

        }
    }
}
